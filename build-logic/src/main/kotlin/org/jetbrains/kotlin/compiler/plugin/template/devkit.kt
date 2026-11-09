package org.jetbrains.kotlin.compiler.plugin.template

import org.jetbrains.kotlin.compiler.plugin.devkit.BetaAndRc
import org.jetbrains.kotlin.compiler.plugin.devkit.DevKitPropertiesDsl

fun DevKitPropertiesDsl<*>.config() {
    cliVersions("2.2.20", betaAndRc = BetaAndRc.LATEST)
    ideaVersions("252", includeRc = true, includeEap = true)
    useLatestBootstrap()
    companionLibrary("plugin-annotations")
}
