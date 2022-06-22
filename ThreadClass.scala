package com.learn.proj
class ThreadClass extends Thread {
  override def run(): Unit = {
    for (x<- 1 to 10) {
      println("Hello!")
      Thread.sleep(1)
    }
  }
}
class Hi extends Thread {
  override def run(): Unit = {
    for (x<- 1 to 10) {
      println("Hi!")
      Thread.sleep(1)
    }
  }
}
object TCO {
  def main(args:Array[String]): Unit = {
    val t1=new ThreadClass()
    val t2=new Hi()
    t1.start()
    t2.start()
    t1.join()
    t2.join()

    print("-----DONE-----")


  }
}
