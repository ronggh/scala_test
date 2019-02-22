// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

val digits = List(4, 2)

// 右结合操作符
9 :: List(4, 2)

// Nil表示空列表
9 :: 4 :: 2 :: Nil

9 :: (4 :: (2 :: Nil))

// 求和方式一
def sum_1(lst: List[Int]): Int = if (lst == Nil) 0 else lst.head + sum_1(lst.tail)

sum_1(List(9, 4, 2))

// 求和方式二
def sum_2(lst: List[Int]): Int = lst match {
  case Nil => 0
  case h :: t => h + sum_2(t) // h is lst.head, t is lst.tail
}

sum_2(List(9, 4, 2))
// 求和方式三
List(9, 4, 2).sum
