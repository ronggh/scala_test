// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

import java.awt.{Color, Font}

Color.RED
Font.BOLD

// 引入包，并重新命名
import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable._

new JavaHashMap[String, Int]
new HashMap[String, Int]

//  import可以在任何地主，不像Java一定在要文件开始
// 隐藏包中的一些类。
import java.util.{HashSet => _, _}
import scala.collection.mutable._

new HashSet[String]
