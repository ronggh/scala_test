// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

// 闭包就是一个函数把外部的那些不属于自己的对象也包含(闭合)进来了。
def mulBy(factor : Double) = (x : Double) => factor * x

// triple,half就叫闭包
val triple = mulBy(3)
val half = mulBy(0.5)
println(triple(14) + " " + half(14))


