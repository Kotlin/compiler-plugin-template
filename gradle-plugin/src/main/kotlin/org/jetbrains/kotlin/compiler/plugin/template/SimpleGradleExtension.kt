package org.jetbrains.kotlin.compiler.plugin.template

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property

open class SimpleGradleExtension(objectFactory: ObjectFactory) {
    val shouldAddRuntimeDependency: Property<Boolean> =
        objectFactory.property(Boolean::class.java).convention(true)
}
