// 高级类型

package object complex{
  //************** 结构类型 ******************
  //任何具备append方法的对象都可以调用
  def appendLines(target: { def append(str: String): Any }, lines: Iterable[String]) {
    for (l <- lines) { target.append(l); target.append("\n") }
  }
}

package complex{
  //***************** 单例类型 ******************
  import scala.collection.mutable.ArrayBuffer
  //import scala.reflect.runtime.
  class A {
    private var name:String=null

    // 返回类型为this.Type，以用于链式调用
    def setName(name:String): this.type ={
      this.name = name
      //println(typeOf[this.type])
      this //返回调用对象
    }
  }


  class B extends A{
    private var age:Int = 0
    def setAge(age:Int)={
      this.age=age
      //println(typeOf[this.type])
      this
    }
  }

  //************** 类型投影 ******************
  // 内部类从属于实例
  class Network {
    class Member{
    }
    val contacts = new ArrayBuffer[Network#Member]
  }

  //************** 类型别名 ******************
  class Document {
    import scala.collection.mutable._
    // 类型别名：类似C/C++中typedef 
    type Index = HashMap[String, (Int, Int)]
  }
  class Book extends Document {
    val tables = new Index
  }

  //************** 自身类型 ******************
  //指代自身
  class Outer { outee =>
    val v1 = "here"
    class Inner {
      //println(Outer.this.v1) // 用outer表示外部类，相当于Outer.this
      println(outee.v1)
    }
  }

  object Main extends App{
    // 链式调用中注意的问题。
    val a:A = new A
    val b:B = new B
    //println(typeOf[a.type] == typeOf[b.type])
    b.setName("Wang").setAge(29)  // 无法执行
    b.setAge(29).setName("Wang")  // 可以执行
    //类型投影
    val na = new Network
    val nb = new Network
    val nam = new na.Member
    val nbm = new nb.Member
    na.contacts += nam
    na.contacts += nbm
    //类型别名
    val book = new Book
    book.tables += ("test"->(1,1))
    //结构类型
    val lines = Array("Mary", "had", "a", "little", "lamb")
    val builder = new StringBuilder
    appendLines(builder, lines)
    println(builder)
  }
}