# Scala Type Erasure Bug in Reduce Operation

This repository demonstrates a subtle bug related to type erasure in Scala when using the `reduce` operation with a custom class that defines a `+` method. The code compiles and runs correctly for direct addition, but throws a `java.lang.ClassCastException` when using `reduce`.

The bug is caused by type erasure in the JVM which loses type information at runtime. Therefore, the compiler cannot infer the correct type to use in the `reduce` method, leading to the runtime error.

The solution provided in `bugSolution.scala` addresses this issue by using a type parameter.