package com.learn.proj

class salary(p1:Int, p2:Int, p3:Int,sal:Double){

  def this(p1:Int, p2:Int, p3:Int)
    {
      this(p1,p2,p3,800)
    }

  def this(p1:Int, p2:Int)
  {
    this(p1,p2,555,5000)
  }
  var hikePercentage:Int=p1;
  var fineAmt:Int=p2;
  var incentive:Int=p3;
  var currentSalary:Double=sal;

  def hike(id:String): Double =
  {
    //val revised_sal = sal + (sal * hikePercentage/100);
    //println("Revised Salary for Empid "+ id + " is "+ revised_sal )
    //return revised_sal
    currentSalary = currentSalary + (currentSalary * hikePercentage/100);
    return currentSalary;
  }

  def getNewSal():Double=
    {
      return currentSalary;
    }

}

