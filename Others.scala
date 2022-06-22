package com.learn.proj

object Others extends App {

  val city=List("New Delhi","Mumbai","Pune","Hyderabad","Bangalore","Chennai")

  val uCity=city.map(x=>x.toUpperCase())
  println(uCity)
}

// map, flatMap, mapPartitions, filter, where