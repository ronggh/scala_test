// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

// 隐式参数
case class Delimiters(left: String, right: String)

// quote()函数：隐式参数
def quote(what: String)(implicit delims: Delimiters) =
  delims.left + what + delims.right

quote("Bonjour le monde")(Delimiters("<<", ">>"))

object FrenchPunctuation {
  implicit val quoteDelimiters = Delimiters("<<---", "--->>")
}

import FrenchPunctuation._
// import FrenchPunctuation.quoteDelimiters
// 隐式参数不用传入，会在上下文中找
quote("Bonjour le monde")

