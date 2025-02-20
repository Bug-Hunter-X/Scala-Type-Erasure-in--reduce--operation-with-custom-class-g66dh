```scala
class MyClass[T](val value: T)(implicit num: Numeric[T]) {
  def +(other: MyClass[T]): MyClass[T] = new MyClass(num.plus(this.value, other.value))
}

object Main extends App {
  val obj1 = new MyClass(5)
  val obj2 = new MyClass(10)
  val sum = obj1 + obj2 // This works fine

  val list = List(obj1, obj2)
  val sumList = list.reduce(_ + _)
}
```