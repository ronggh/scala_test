package com.ch09.sec01

class Person {
  var name = ""
}

// 类Employee继承自类Person
class Employee extends Person {
  var salary = 0.0
  def description = "An employee with name " + name + " and salary " + salary
}

object Sec01Main extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred.description)
}

