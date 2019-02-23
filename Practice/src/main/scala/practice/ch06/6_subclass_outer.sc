import scala.collection.mutable.ArrayBuffer
// 在内嵌类中，你可以通过 外部类.this 的方式来访问外部类的this 引用。
// 还可以对其进行命名访问。
class Network(val name: String) { outer =>  
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
    def description = name + " inside " + outer.name
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

val chatter = new Network("Chatter")
val myFace = new Network("MyFace")

val fred = chatter.join("Fred")
println(fred.description);
val barney = myFace.join("Barney")
println(barney.description);
