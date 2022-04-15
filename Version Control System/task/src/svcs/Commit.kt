package svcs

import java.io.File

data class Commit(
    val dirName:String,
    val author:String,
    val message:String,
    val files: List<CommitFile>)

