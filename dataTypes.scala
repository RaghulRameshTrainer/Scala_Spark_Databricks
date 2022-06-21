package com.learn.proj

object dataTypes extends App {

  //  val nums: List[Int]=List(10,20,30,40,50);
  //  println(nums(1));
  //  nums(5)=60;
  //  println(nums(5));

  // TUPLE

  //  val info = ("Spark", 40, "Tuesday")
  //
  //  println("Technology Name :"+ info._1)
  //  print("Duration of the course is :"+ info._2 + " hrs")
  //
  // MAP  ( Unordered Array)
 import scala.collection.mutable.Map
  val capitals = Map("India" -> "New Delhi",
    "USA" -> "Newyork",
    "UK" -> "London");
//  println("Capital of INDIA is: " + capitals("India"))
//  println("List of country :" + capitals.keys)
//  println("Capitals of country :" + capitals.values)


//  for (k <- capitals.keys) {
//    println(k + " : " + capitals(k))
//  }

//  if (capitals.contains("India")) {
//    println(capitals("India"));
//  } else {
//    println("India is not part of the Map");
//  }

//  import scala.collection.mutable.ArrayBuffer;
//
//  var name = new ArrayBuffer[String]();
//  name += ("Pawan","Shyam","Janaki","Kishor","Ganesh","Ramya");
//
//  println(name.take(3))    # take, top, sample

//  name.insert(1,"Jagan")
//  println(name)
//  name.append("Karthick")
//  println(name)
//  name.prepend("Sangeetha")
//  println(name)
//  name.trimStart(3)
//  println(name)
//  name.trimEnd(2)
//  println(name)
//  name.clear()
//  print(name)
//  name += "Pawan";
//  name += "Aveek"
//  println(name(1))
//  name += "Venkatesh"
//  println(name(2))
//  name += ("Siva","Shyam","Kishor")
//  println(name);
//
//  name -= "Kishor";
//
//  println(name);
//
//  name -= ("Shyam","Ramya");
//  println(name);
//
//  name.remove(1);
//  print(name)

//  import scala.collection.mutable.ListBuffer;
//
//  val numbers = ListBuffer[Int]();
//
//  numbers+=(10,20,30,40,50);
//  numbers += 60;
//  numbers.append(70,80,90,100,110)
//
//  println(numbers)

//    import scala.collection.mutable.Set
//  var nums : Set[Int] = Set(10,20,10,30,40,10,20,50);
//  print(nums)

//  val x = Seq(1,5,6,7,8,5,5,9,10)
//
//  println(x)
  //  val age = scala.io.StdIn.readInt()

  val x = 10;

 val tday= x match {
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Sunday"
    case 4 => "Wednesday"
    case 5 => "Thursday"
    case 6 => "Friday"
    case 7 => "Saturday"
    case _ => "Invalid Day!"
  }

  println("TODAY : " + tday);


  // Create a calculator function which accepts 3 values (2 numbers and operator, 5,6, "add")4
//  def calcualter(x:Int,y:Int, op:String):Any = {
//    //add , sub, mul, div, exp
//  }

  import java.io.IOException;


  try
    {
      val y = 10/0
      println("The result of 10 divide by 5 is : " + y)

      val z=Array(0,20,30);
      println("Last element of the array : " + z(2))
      val l=z.length;
      println("Total number of elements in the given array is : " + l)

      if(z(0)==0)
        {
          println("Calling custom exception");
          throw new Exception()
        }
    } catch {
    case a: IndexOutOfBoundsException =>
      {
        println("Array out of index exception received : " + a )
        println("Please check the values stored in the array" )
      }
    case a : ArithmeticException =>
      {
        println("GOT ZERO DIVISION ERROR : " + a)
      }
    case a: Exception =>
      {
        println("Received New Exception : " + a)
      }
  }

  println("I am out of try and catch block")
}
