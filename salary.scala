package com.learn.proj

class salary(p1:Int, p2:Int, p3:Int,sal:Double){

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

