package com.shouzhuan.kuikly.kit

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.vfs.VfsUtil
import kotlin.text.Charsets

/** Creates a Kotlin stub that calls published public APIs only. */
class NewSzPageAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        val selected = e.getData(CommonDataKeys.VIRTUAL_FILE)
        val dir = when {
            selected == null -> null
            selected.isDirectory -> selected
            else -> selected.parent
        }
        if (dir == null) {
            Messages.showErrorDialog(project, "Select a directory", TITLE)
            return
        }
        val name = Messages.showInputDialog(
            project,
            "Class name",
            TITLE,
            null,
            "SzPage",
            null,
        ) ?: return
        val templateUrl = NewSzPageAction::class.java.getResource("/fileTemplates/SzPage.kt.ft") ?: return
        val body = String(templateUrl.readBytes(), Charsets.UTF_8).replace("\${NAME}", name)
        WriteCommandAction.runWriteCommandAction(project) {
            val file = dir.createChildData(this, "$name.kt")
            VfsUtil.saveText(file, body)
        }
    }

    companion object {
        private const val TITLE = "ShouZhuan Kuikly Kit"
    }
}
