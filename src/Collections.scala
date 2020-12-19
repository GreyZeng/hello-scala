package git.snippet.scala

import java.util
import scala.collection.mutable
import scala.collection.mutable.Set
import scala.collection.mutable.ListBuffer

/**
 * Young
 * 2020/12/19
 * */
object Collections {
  def main(args: Array[String]): Unit = {
    val list = new util.LinkedList[String]()
    list.add("hell0")


    val arr = Array[Int](1, 2, 4, 5)
    arr(1) = 3
    println(arr(1))


    for (elem <- arr) {
      println(elem)
    }

    println("----------------")
    arr.foreach(println)
    println("----------------")
    // 链表
    // 不可变集合 默认是不可变的集合
    val list2 = List(1, 2, 34, 4)
    list2.foreach(println)
    println("----------------")
    val list22 = new ListBuffer[Int]()
    list22.+=(33)
    list22.+=(33)
    list22.+=(31)
    list22.+=(33)
    list22.+=(33)

    list22.foreach(println)
    println("----------------")

    val sets = Set(3223, 323, 323)
    sets.foreach(println)
    println("----------------")

    val set02: mutable.Set[Int] = Set(22, 3);
    set02.+=(3)
    set02.+=(3)
    set02.foreach(println)
    println("----------------")

    var set03 /*: Predef.Set[Int]*/ = scala.collection.immutable.Set(2, 3, 3)
    set03.+=(3)
    set03.foreach(println)


    // tuple使用
    println("----------------")
    val tuple = new Tuple2(11, "33")
    var tuple3 = Tuple3(22, "3323", "dd")
    val tuple1 = (1, 2, 23, 34, 4)
    println(tuple3._1)
    println(tuple._2)
    val tuple2 = ((a: Int) => a + 8, 3, 3, 3)
    val tuple2Va = tuple2._1(3)
    println(tuple2Va)
    println(tuple2._1)

    val tIter = tuple3.productIterator
    while (tIter.hasNext) {
      println(tIter.next())
    }

    // map学习
    val map01 = Map(("a", 33), "b" -> 333)
    val keys = map01.keys
    // 返回的是some 或者 none
    println(map01.get("a"))
    println(map01.get("X"))
    println(map01.getOrElse("a", 3232323))
    println(map01.getOrElse("X", 3232323))
    for (e <- keys) {
      println(map01.get(e).get)
    }
    val tmap = mutable.Map(("x", 3), "y" -> 33)
    tmap.put("ddasd", 333)
    val i = tmap.getOrElse("ddasd", 3323)
    println(i)


    val tasd = List(2332, 323)
    tasd.foreach(println)

    val value = tasd.map((x: Int) => x + 1)
    value.foreach(println)
    tasd.foreach(println) // 还是原始数据
    val value1 = tasd.map(_ * 10)
    value1.foreach(println)


    // 扁平化
    val value2 = List("dd xx", "xx tt", "aa bb")
    // val value2 = Array("dd xx", "xx tt", "aa bb")
    val value3 = value2.flatMap((x: String) => x.split(" "))
    value3.foreach(println)
    val value4 = value3.map((_, 1))
    value4.foreach(println)

    println("----------------")

    // 可以用迭代器解决内存占用的问题
    val iterator = value2.iterator
    // flatMap返回一个新的迭代器，没有发生计算！！！
    val ddd = iterator.flatMap((x: String) => x.split(" "))
    ddd.foreach(println)
    val dddd = ddd.map((_, 1))
    dddd.foreach(println)



  }
}
