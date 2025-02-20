```scala
class MyClass(val value: Int) {
  def +(other: MyClass): MyClass = new MyClass(this.value + other.value)
}

object Main extends App {
  val obj1 = new MyClass(5)
  val obj2 = new MyClass(10)
  val sum = obj1 + obj2 // This works fine

  val list = List(obj1, obj2)
  val sumList = list.reduce(_ + _)
}
```