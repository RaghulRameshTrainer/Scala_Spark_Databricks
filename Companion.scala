package com.learn.proj

class Companion {
  val name="pawan"
  val tech="spark"
  private val sal="1000"

  private def getNameAndTech():String={
    name + " " + tech
  }
}

object Companion {
  def main(args: Array[String]):Unit={
    val obj=new Companion()
    println("Pawan's Salary:" + obj.sal)
    println(obj.getNameAndTech())
  }
}
