// 入口函数：main()，方式一：可以直接定义一个
object Hello {
  def main(args: Array[String]) {
    println("Hello, World!")
  }
}

// 入口函数：main()，方式二：扩展自App特质（其中含有main()方法的定义
// def main(args : scala.Array[scala.Predef.String]) : scala.Unit = { /* compiled code */ }
object Hello1 extends App {
  if (args.length > 0)
    println("Hello, " + args(0))
  else
    println("Hello, World!")
}