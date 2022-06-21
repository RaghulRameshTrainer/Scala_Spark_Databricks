package com.learn.proj
import com.learn.proj.salary

object salCalc {

  def main(args:Array[String]): Unit =
  {
    val emp1=new salary(10,1000,10000,100000);
//    println("New salary at com1:"+emp1.hike("88764",50000));
//    println("New salary at com2:"+emp1.hike("564519",90000));
    emp1.hike("1490534");
    print("NEW SALARY:"+emp1.getNewSal())
  }

}
