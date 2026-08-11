package org.jetbrains.kotlin.compiler.plugin.template

// TODO hacky. JVM target classes are merged in, so `actual` resolution sometimes picks them
//  so we declare the same exact class but with no `actual`s to override it
internal fun foo() {}
