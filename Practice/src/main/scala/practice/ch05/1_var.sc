// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.
// 高阶函数1:将函数作为参数
import scala.math._
val num = 3.14
// _将ceil方法转换成函数，将函数赋值给变量
val fun = ceil _

fun(num)

// 传递函数
Array(3.14, 1.42, 2.0).map(fun)


def plus(x: Double) = 3 * x

// 调用上面定义好的plus()函数
Array(3.14, 1.42, 2.0).map(plus)
// 直接使用 _ * 3
Array(3.14, 1.42, 2.0).map(_ * 3)

