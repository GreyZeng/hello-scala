# Scala学习

主方法只能定义在Object文件中

class中类似Java里面需要new的对象 Object类似静态的类 分号是可有可无的

Java类中，文件名和类同名；Scala中，类名和文件名没有必然关系

同包下，class要是一样的话，散布在不同文件中，编译不通过

Object约等于static，单例

```scala
// scala中拼接字符串
println(s"asdfasdf$a")
println(s"asdfasdf${a + 3}")

// var : 变量 / val：常量（类似Java中的final）
// 类名构造器中的参数就是类的成员属性，且默认是val类型，且默认是private
// 只有在类名构造器中的参数可以设置成var，其他方法函数中的参数都是val类型的，且不允许设置为var类型
class Printer(size: Int) {

}
```

Scala中，裸露的代码是默认构造中的

```scala
def this(xname: String) {
  // 必须要调用默认构造
  this()
  name = xname
}
```

```scala
// object和class的名字一致，两者就是伴生关系，class可以访问Object中的私有成员变量
object X {
  private val name = "x"
}

class X {
  def p(): Unit = {
    println(s"Hello ${X.name}")
  }
}
```