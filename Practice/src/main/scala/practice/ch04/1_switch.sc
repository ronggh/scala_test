// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

var sign = 0
for (ch <- "+-!") {

  ch match {
    case '+' => sign = 1
    case '-' => sign = -1
    case _ => sign = 0
  }

  println(sign)
}

// math也可以有返回值
for (ch <- "+-!") {

  sign = ch match {
    case '+' => 1
    case '-' => -1
    case _ => 0
  }
  println(sign)
}

// match可以匹配Java中的类
import java.awt._

val color = SystemColor.textText 
color match {
  case Color.RED => "Text is red"
  case Color.BLACK => "Text is black"
  case _ => "Not red or black"
}


