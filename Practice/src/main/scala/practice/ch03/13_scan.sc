// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

// 将二元函数(需要二个参数，_,_分别代表第一个和第二个)应用于集合
// 二元函数：化简、折叠、扫描
// 部分化简操作reduceLeft(),reduceRight()
// 1-7-2-9 = -17
List(1, 7, 2, 9).reduceLeft(_ - _)
// 1-(7-(2-9)) = -13
List(1, 7, 2, 9).reduceRight(_ - _)


// 折叠操作:foldLeft(),需要有个初始值，
// 下例初始值为0，即0-1-7-2-9 =-19
List(1, 7, 2, 9).foldLeft(0)(_ - _)
// 可以用以下方式来表示 foldLeft
(0 /: List(1, 7, 2, 9))(_ - _)


// 统计一个字符串中字母出现的频率，通过一个可变的Map[Char,Int]()实现
val freq = scala.collection.mutable.Map[Char, Int]()
// 赋值操作
for (c <- "Mississippi") freq(c) = freq.getOrElse(c, 0) + 1

(Map[Char, Int]() /: "Mississippi") {
  (m, c) => m + (c -> (m.getOrElse(c, 0) + 1))
}

// 扫描操作:scanLeft()，简化和折叠的结合
// 0
// 0 + 1 = 1
// 1 + 2 = 3
// 3 + 3 = 6
// 6 + 4 = 10
// 10 + 5 = 15，...
(1 to 10).scanLeft(0)(_ + _)
