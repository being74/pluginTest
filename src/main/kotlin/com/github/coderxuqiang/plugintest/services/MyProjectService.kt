package com.github.coderxuqiang.plugintest.services

import com.intellij.openapi.project.Project
import com.github.coderxuqiang.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
