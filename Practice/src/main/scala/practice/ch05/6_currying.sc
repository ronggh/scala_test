// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.
// 函数编程中，接受多个参数的函数都可以转化为接受单个参数的函数，
//这个转化过程就叫柯里化，柯里化就是证明了函数只需要一个参数而已。
// 传统定义两个参数
def mul(x:Int, y: Int) = x * y
mul(6,7)
// 柯里化定义，使用到了闭包
def mulOneAtATime1(x: Int) = (y: Int) => x * y

mulOneAtATime1(6)(7)

// Scala中可以简写
def mulOneAtATime2(x: Int)(y: Int) = x * y
mulOneAtATime2(6)(7)
val a = Array("Hello", "World")
val b = Array("hello", "world")
// def corresponds[B](that: GenSeq[B])(p: (A,B) => Boolean): Boolean
a.corresponds(b)(_.equalsIgnoreCase(_))


