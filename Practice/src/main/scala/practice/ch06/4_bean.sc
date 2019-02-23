import scala.beans.BeanProperty
// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

// 将Scala 字//段加@BeanProperty 时，这样的方法会自动生成:
// Java 的属性是像getXXX（）和setXXX（）的方法
class Person {
  @BeanProperty var name : String = _
}

val fred = new Person
fred.setName("Fred")
fred.getName
