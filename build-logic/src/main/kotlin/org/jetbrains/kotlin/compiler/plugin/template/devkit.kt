package org.jetbrains.kotlin.compiler.plugin.template

import org.jetbrains.kotlin.compiler.plugin.devkit.BetaAndRc
import org.jetbrains.kotlin.compiler.plugin.devkit.DevKitPropertiesDsl

fun DevKitPropertiesDsl<*>.config() {
    cliVersions("2.3.20", betaAndRc = BetaAndRc.LATEST)
    ideaVersions("261", includeRc = true, includeEap = true)
    useLatestBootstrap()
}
