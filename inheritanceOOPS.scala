package com.learn.proj

object inheritanceOOPS extends App {

  class Employee {
    val name = "Pawan"
    final val email= "trainer@abc.com"
    val designation="Developer"

    def getEmail():String={
      return email
    }
    final def aboutEmp(empname:String)={
      println(empname + " is working as a bigdata trainer.")
    }
  }

  abstract class businessAnalyst {
    def trainingInfo()
    }

  class Manager extends Employee  {
    override val designation = "Manager"
    //override val email="pawan@outlook.com"

    override def getEmail(): String = {
      return super.getEmail()
    }
  }

  trait myTrait
  {
    def project:Unit
    def workingHours():String="09:30am to 01:30pm"
  }

  trait SecondTrait
  {
    def officeInfo:Unit
  }

  class Lead extends Employee with myTrait with SecondTrait {
    override def project(): Unit = {
      println("Scala-Spark-Databricks ")
    }

    override def officeInfo(): Unit = {
      println("PAN INDIA")
    }
  }



 val mgr = new Manager()
  println("Designation: " + mgr.designation)
  println("Email ID :" + mgr.getEmail())
  mgr.aboutEmp("Pawan")

  val l=new Lead()
  l.project()
  l.officeInfo()
  println(l.workingHours())
}
/*
    Traits                                                                    Abstract Class
  Supports Multiple Inheritance                                 Does not support multiple inheritance
  has both abstract and non-abstract methods                    abstract methods
  trait does not contain constructor parameters                 allowed
*/

/* -- All the re-usability are maintained in a class
scala spark projects are started with Objects.

Frameworks
 */