package git.snippet.scala

/**
 * Young
 * 2020/12/18
 * */
object Hello {
  private val p = new Printer(2)
  // 可以在Object中直接定义语句，优先于main方法执行
  println("Hello up")
  val name = "zhs"

  def main(args: Array[String]): Unit = {
    println("Hello world")
    p.print()
  }

  println("Hello down")
}


class Printer(size: Int) {
  /*val size = 1*/
  var name = "zhangsan";

  def this(xname: String) {
    this(2);
    name = xname
  }

  var a = 3;
  println(s"Printer-->$size")

  def print(): Unit = {
    println(s"Hello Printer${new Printer("lishi").name}");
  }

  println(s"After Printer->${size + 3}")
}