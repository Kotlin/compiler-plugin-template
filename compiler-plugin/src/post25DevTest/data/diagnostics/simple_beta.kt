// RUN_PIPELINE_TILL: FRONTEND
// REQUIRES_TOP_LEVEL_GENERATION

package foo.bar

import org.jetbrains.kotlin.compiler.plugin.template.SomeAnnotation

@SomeAnnotation
fun test() {
    val s = MyClass().bar()
    s.<!UNRESOLVED_REFERENCE!>inc<!>() // should be an error
}
