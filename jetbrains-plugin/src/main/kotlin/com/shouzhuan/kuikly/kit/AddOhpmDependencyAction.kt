package com.shouzhuan.kuikly.kit

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.fileEditor.FileDocumentManager
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.psi.search.FilenameIndex
import com.intellij.psi.search.GlobalSearchScope

/** Inserts the published OHPM coordinate into `oh-package.json5`. */
class AddOhpmDependencyAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        val files = FilenameIndex.getVirtualFilesByName(
            "oh-package.json5",
            GlobalSearchScope.projectScope(project),
        )
        val target = files.firstOrNull()
        if (target == null) {
            Messages.showErrorDialog(project, "No oh-package.json5 found", TITLE)
            return
        }
        val document = FileDocumentManager.getInstance().getDocument(target) ?: return
        val line = "    \"@shouzhuan/kuikly\": \"0.1.0\","
        if (document.text.contains("@shouzhuan/kuikly")) {
            Messages.showInfoMessage(project, "Already present in ${target.name}", TITLE)
            return
        }
        WriteCommandAction.runWriteCommandAction(project) {
            val text = document.text
            val depKey = "\"dependencies\""
            val keyIdx = text.indexOf(depKey)
            val insertAt = if (keyIdx < 0) {
                text.length
            } else {
                val brace = text.indexOf('{', keyIdx)
                val nl = if (brace >= 0) text.indexOf('\n', brace) else -1
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
