package org.jetbrains.kotlin.compiler.plugin.template

// TODO hacky. Ideally, we'll remove JVM target
actual val generateBar: Boolean
    get() = false
