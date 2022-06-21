package com.learn.proj

object func extends App {

  def addNum(x:Int , y:Int): Int = {
    var res:Int=0;
    res = x + y;
    return res;
  }

  //println("Addition of 10 and 20 is :" + addNum(10,20))

  def prodNums(x:Int, y:Int=1): Int = {
    var res:Int=0;
    res = x * y;
    return res;
  }

  //println("Product of 15 and 10 is :" + prodNums(15,10))
  // higher order fucntion, anonymous function, currying function,

  def aboutTraining(tech:String,duration:Int):Unit={
    println("Technology: "+tech)
    println("Training duration:"+duration+" hours")
  }

  //aboutTraining(duration = 40,tech="Scala Spark")
//  def custName(name:*String):Any ={
//
//    for(x <- name){
//      println(x)
//    }
//  custName("Pawan", "Aveek", "Pankaj")

 // }
// HIGHER ORDER FUNCTION
  def bonus(sal:Int):Double=((sal*1.5))
  //def hike(sal:Int):Double=((sal*2.0))
  def hike(sal:Int):Double={
    val new_sal=sal*2.0;
    return new_sal
  }

  val salaries=Seq(20000,30000,40000)

  val revised_sal=salaries.map(hike)

  //println(revised_sal)

  //Closures FUNCTION
// A closure is a function whore return value depends on the value of one or more variable declared outside this function
  var bounuspercent=20;
  def bonusCalc(sal:Int):Double={
    val revised_salary=sal*bounuspercent/100;
    val total_salary=sal+revised_salary;

    return total_salary
  }

  //println(bonusCalc(50000))

  // Currying Function

  def taxCalc(bill:Int)(gst:Int):Int={
    val gst_amount=bill*gst/100;
    val total_bill=bill+gst_amount
    return total_bill;
  }

  var billAmt=taxCalc(1000)(_);
  val billAmt_Ind=billAmt(18);
  val billAmt_Sing=billAmt(6)
  println("Total bill amount inclussive of GST is in India: "+billAmt_Ind)
  println("Total bill amount inclussive of GST is in Singapore: "+billAmt_Sing)

// CREATE A FUNCTION TO FIND A BIGGEST NUMBER AMONG GIVEN 3 NUMBER
}
