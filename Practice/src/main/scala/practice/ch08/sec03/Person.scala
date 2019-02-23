package com.ch08.sec03

// 定义在父包
// package object定义一个包对象，在包对象里可以定义常量和函数
package object people {
  val defaultName = "John Q. Public"
}

package people{
  class Person {
    var name = defaultName // A constant from the package
    def description = "A person with name " + name
  }
}

object Sec03Main extends App {
  val john = new com.sec03.people.Person
  println(john.description)
}
