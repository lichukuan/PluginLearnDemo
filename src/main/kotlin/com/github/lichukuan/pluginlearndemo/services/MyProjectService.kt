package com.github.lichukuan.pluginlearndemo.services

import com.intellij.openapi.project.Project
import com.github.lichukuan.pluginlearndemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
