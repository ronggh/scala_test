// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.
// 高阶函数2：匿名函数
// 函数表达式
(x: Double) => 3 * x

// 匿名函数，赋给变量，通过变量进行引用
val triple = (x: Double) => 3 * x

Array(3.14, 1.42, 2.0).map(triple)
// 包含在()中
Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)
// 包含在{}中
Array(3.14, 1.42, 2.0) map { (x: Double) => 3 * x }

def triple(x:Double)= 3 * x