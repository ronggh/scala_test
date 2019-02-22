// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.
// 变量赋值中的模式匹配
val (x, y) = (1, 2)

val (q, r) = BigInt(10) /% 3

val arr = Array(1, 7, 2, 9)

val Array(first, second, _*) = arr

