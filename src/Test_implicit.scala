package git.snippet.scala

import java.util

/**
 * Young
 * 2020/12/19
 * */
object Test_implicit {
  // 隐式转换
  def main(args: Array[String]): Unit = {
    val list = new util.LinkedList[Int]()
    list.add(1)
    list.add(2)
    list.add(3)

    /*def foreach[T](list: util.LinkedList[T], f: (T) => Unit): Unit = {
      val value = list.iterator()
      while (value.hasNext) {
        f(value.next())
      }
    }

    foreach(list, println)
    foreach(list, println)*/


    //    new XX[Int](list).foreach(println)

    //  隐式转换
    implicit def xxx[T](list: util.LinkedList[T]): XX[T] = {
      val value = list.iterator()
      new XX(value)
    }

    list.foreach(println)
    /*implicit def xxx[T](list: util.LinkedList[T]): XX[T] = {
      new XX(list)
    }

    list.forEach(println)
    */
    // 隐式转换类
    /*implicit
    class KKK[T](list: util.LinkedList[T]) {
      def foreach(f: (T) => Unit): Unit = {
        val value = list.iterator()
        while (value.hasNext) {
          f(value.next())
        }
      }
    }*/
    // 隐式转换参数
    implicit val asdfasdf: String = "dasdfas"
    // implicit val asdfasdf: String = "ddd"
    implicit val dsdfasd: Int = 3323

    def ox(implicit name: String, age: Int): Unit = {
      println(name)
      println(age)
    }

    ox("dasdf", 88)
    ox

    // 柯里化 + implicit
    def ox2(age: Int)(implicit name: String): Unit = {
      println(name)
      println(age)
    }

    ox2(3)

    def xxo(s: String = "dbb"): Unit = {
      println(s)
    }
    xxo("dds")
  }
}

class XX[T](list: util.Iterator[T]) {
  def foreach(f: (T) => Unit): Unit = {
    while (list.hasNext) {
      f(list.next())
    }
  }
}
