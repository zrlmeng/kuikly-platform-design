package com.shouzhuan.kuikly.kit

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.fileEditor.FileDocumentManager
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.psi.search.FilenameIndex
import com.intellij.psi.search.GlobalSearchScope

/** Inserts the published Maven coordinate into a project `build.gradle.kts`. */
class AddMavenDependencyAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        val files = FilenameIndex.getVirtualFilesByName(
            "build.gradle.kts",
            GlobalSearchScope.projectScope(project),
        )
        val target = files.firstOrNull { vf ->
            val path = vf.path
            path.contains("/app/") || path.contains("\\app\\")
        } ?: files.firstOrNull()

        if (target == null) {
            Messages.showErrorDialog(project, "No build.gradle.kts found", TITLE)
            return
        }
        val document = FileDocumentManager.getInstance().getDocument(target) ?: return
        val line = "    implementation(\"com.shouzhuan.kuikly:ui:0.1.0\")"
        if (document.text.contains("com.shouzhuan.kuikly:ui")) {
            Messages.showInfoMessage(project, "Already present in ${target.name}", TITLE)
            return
        }
        WriteCommandAction.runWriteCommandAction(project) {
            val text = document.text
            val depIdx = text.indexOf("dependencies {")
            val insertAt = if (depIdx < 0) {
                text.length
            } else {
                val nl = text.indexOf('\n', depIdx)
                if (nl >= 0) nl + 1 else text.length
            }
            document.insertString(insertAt, "$line\n")
        }
        VfsUtil.markDirtyAndRefresh(false, false, false, target)
        Messages.showInfoMessage(project, "Inserted into ${target.path}", TITLE)
    }

    companion object {
        private const val TITLE = "ShouZhuan Kuikly Kit"
    }
}
