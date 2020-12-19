package git.snippet.scala

/**
 * Young
 * 2020/12/19
 * */

object Test_Match {
  def main(args: Array[String]): Unit = {

    val tuple = (1.0, "abcd", "dd", 55, true)
    val iter = tuple.productIterator
    val iter2 = iter.map(x => {
      x match {
        case w: Int if w > 3 => println("x > 3")
        case o: Int => println(s"$o...$x....")
        case true => println("true")
        case _ => println("default")
      }
    })
    while (iter2.hasNext) {
      println(iter2.next())
    }
  }
}
