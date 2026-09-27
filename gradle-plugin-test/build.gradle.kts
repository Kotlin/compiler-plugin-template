plugins {
    pluginDevKit("gradle-plugin")
}

pluginDevKit {
    includedBuildProjects.add("gradle-plugin")
}
