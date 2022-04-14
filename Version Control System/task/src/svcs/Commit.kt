package svcs

data class Commit(val dirName:String,val author:String,val message:String,val files: List<Pair<String,String>>)
