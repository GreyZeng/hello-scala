package git.snippet.scala

import java.util.Date
import scala.collection.mutable

/**
 * Young
 * 2020/12/19
 * */
object MethodTest {
  def main(args: Array[String]): Unit = {
    def fun(): Unit = {
      println("hello world")
    }

    fun()


    var x = 3
    val y = fun()
    println(y)


    def fun02(): String = {
      // return可有可无
      // 但是加了return 必须有返回类型
      return "Hello2"
    }

    val z = fun02()
    println(z)

    // 默认是val类型
    def fun03(a: Int): Unit = {
      println(a)
    }

    fun03(333)


    // 定义递归 阶乘
    def fun04(num: Int): Int = {
      if (num == 1) {
        num
      } else {
        num * fun04(num - 1)
      }
    }

    println(fun04(3))


    def fun05(a: Int = 9, b: String = "abc"): Unit = {
      println(a)
      println(b)
    }

    fun05()
    fun05(3, "3433")
    fun05(b = "xsd")


    //匿名函数
    val add: (Int, Int) => Int = (a: Int, b: Int) => {
      a + b
    }
    val i = add(3, 3)
    println(i);

    // 嵌套函数
    def fun06(a: String): Unit = {
      def fun05(): Unit = {
        println(a)
      }

      fun05()
    }

    fun06("嵌套函数")


    // 偏应用函数
    def fun07(data: Date, tp: String, msg: String): Unit = {
      println(s"$data\t$tp\t$msg")
    }

    fun07(new Date(), "Info", "ok")

    val info = fun07(_: Date, "info", _: String)
    info(new Date(), "ok")
    val error = fun07(_: Date, "error", _: String)
    error(new Date(), "error")


    // 可变长参数列表
    def fun08(a: Int*): Unit = {
      for (e <- a) {
        println(e)
      }
    }

    fun08(2)
    fun08(2, 3)
    fun08(2, 3, 4)
  }
}
