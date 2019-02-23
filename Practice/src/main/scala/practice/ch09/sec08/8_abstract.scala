package com.ch09.sec08
// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

//可以通过 abstract 关键字标记不能被实例化的类。方法不用标记
//abstract，只要省掉方法体即可。类可以拥有抽象字段，抽象字段就是没有初
//始值的字段。
abstract class Person(val pname: String) {
  val id: Int
  // No initializer—this is an abstract field with an abstract getter method
  var name: String
  // Another abstract field, with abstract getter and setter methods
  def idString: Int // No method body—this is an abstract method
}

class Employee(pname: String) extends Person(pname) {
  val id = 5;
  var name = ">>>"
  def idString = pname.hashCode // override keyword not required
}



object Main extends App {
  val fred = new Employee("Fred")
  println(fred.id)
  println(fred.name)
  println(fred.idString)
}