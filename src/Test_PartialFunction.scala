package git.snippet.scala

/**
 * Young
 * 2020/12/19
 * */
object Test_PartialFunction {
  def main(args: Array[String]): Unit = {

    // 偏函数
    def xy: PartialFunction[Any, String] = {
      case "hello" => "hello2"
      case x: Int => s"$x..."
      case _ => "none"
    }

    println(xy("hello"))
    println(xy(3))
    println(xy("ddd"))
  }
}
