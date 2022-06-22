package com.learn.proj

object customerCaseClass extends App{

  case class Person(name:String, age:Int, tech:String)

  val emp1=Person("Pawan",37,"Spark");
  val emp2=Person("Aveek",40,"AWS")
  val emp3=Person("Ranga",55,"IT")

  println("Name of the Emp1 : " + emp1.name)
  println("Age of the Emp1 : " + emp1.age)
  println("Tech of the Emp1 : " + emp1.tech)

  println("Name of the Emp2 : " + emp2.name)
  println("Age of the Emp2 : " + emp2.age)
  println("Tech of the Emp2 : " + emp2.tech)

  println("Name of the Emp3 : " + emp3.name)
  println("Age of the Emp3 : " + emp3.age)
  println("Tech of the Emp3 : " + emp3.name)

}

