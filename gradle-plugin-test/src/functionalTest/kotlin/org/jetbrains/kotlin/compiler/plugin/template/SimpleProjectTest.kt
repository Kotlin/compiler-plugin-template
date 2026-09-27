package org.jetbrains.kotlin.compiler.plugin.template

import com.autonomousapps.kit.GradleBuilder.build
import org.intellij.lang.annotations.Language
import org.jetbrains.kotlin.compiler.plugin.devkit.test.assertOutputContains
import org.junit.Test

class SimpleProjectTest {
    @Test
    fun testHasAnnotationsDependency() {
        val project =
            object : SimpleProject() {
                    override fun sources() = listOf(source(simpleFile))
                }
                .gradleProject
        val result = build(project.rootDir, "dependencies", "--configuration", "compileClasspath")
        result.assertOutputContains(
            "org.jetbrains.kotlin.compiler.plugin.template:plugin-annotations"
        )
    }

    @Test
    fun testCompiles() {
        val project =
            object : SimpleProject() {
                    override fun sources() = listOf(source(simpleFile))
                }
                .gradleProject
        build(project.rootDir, "build")
    }
}

@Language("kotlin")
private val simpleFile =
    """
    @SomeAnnotation
    fun main() {
        val result = MyClass().foo()
        require(result == "Hello world")
    }
    """
        .trimIndent()
