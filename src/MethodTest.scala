package git.snippet.scala

import java.util.Date

/**
 * Young
 * 2020/12/19
 * */
object MethodTest {
  def test(): Unit = {
    println("test")
  }

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
      a.foreach((x: Int) => {
        println(x)
      })

      a.foreach(
        println(_)
      )

      a.foreach(println)
    }

    fun08(2)
    fun08(2, 3)
    fun08(2, 3, 4)


    // 高阶函数
    def compute(a: Int, b: Int, f: (Int, Int) => Int): Unit = {
      val i1 = f(a, b)
      println(i1);
    }

    compute(3, 89, (x: Int, y: Int) => {
      x + y
    })
    compute(3, 89, (x: Int, y: Int) => {
      x * y
    })
    compute(3, 89, (x: Int, y: Int) => {
      x - y
    })
    compute(3, 89, _ + _)
    compute(3, 89, _ - _)
    compute(3, 89, _ * _)

    def factory(i: String): (Int, Int) => Int = {
      def plus(x: Int, y: Int): Int = {
        x + y
      }

      if (i.equals("+")) {
        plus
      } else {
        (x: Int, y: Int) => (x * y)
      }
    }

    compute(3, 8, factory("+"))
    compute(3, 8, factory("*"))


    // 柯里化

    def fun09(a: Int)(b: Int)(c: String): Unit = {
      println(s"$a $b $c")
    }

    fun09(3)(8)("ddasdf")


    def fun10(a: Int*)(b: String*): Unit = {
      a.foreach(println)
      b.foreach(println)
    }

    fun10(1, 2, 3, 4)("dsdfs", "dsadfas")

    // 方法不想执行，赋值给一个应用 方法名 + 空格 + 下划线
    val func = test _
    func()
  }
}
