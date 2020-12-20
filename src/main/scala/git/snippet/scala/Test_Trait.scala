package git.snippet.scala

/**
 * Young
 * 2020/12/19
 * */
object Test_Trait {
  def main(args: Array[String]): Unit = {
    val zs = new Person("zs")
    zs.hello
    zs.a()
    zs.b()
    zs.abs()
  }
}
class Person(name:String) extends X with Y{
  def hello: Unit ={
    println(s"$name say hello")
  }

  override def abs(): Unit = {

    println("Person X abs")
  }
}

trait X {
  def abs(): Unit
  def a(): Unit ={
    println("X :a")
  }
}
trait Y {
  def b(): Unit = {
    println("Y: b")
  }
}
