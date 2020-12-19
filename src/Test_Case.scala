package git.snippet.scala

/**
 * Young
 * 2020/12/19
 * */
object Test_Case {
  def main(args: Array[String]): Unit = {
    val dog1 = dog("xx", 1)
    val dog2 = dog("xx", 1)
    println(dog1 == dog2)
  }
}

// 定义消息
case class dog(name: String, age: Int) {

}
