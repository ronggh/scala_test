// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

// Scala 中没有枚举类型，定义一个扩展Enumeration 类的对象，并以value
//调用初始化枚举中的所有可能值。
object TrafficLightColor extends Enumeration {
  val Red, Yellow, Green = Value
}

TrafficLightColor.Red
TrafficLightColor.Red.id

object TrafficLightColorSecond extends Enumeration {
  val Red = Value(0, "Stop")
  val Yellow = Value(10) // Name "Yellow"
  val Green = Value("Go") // ID 11
}

import TrafficLightColorSecond._

Red
Yellow
Green
Green.id