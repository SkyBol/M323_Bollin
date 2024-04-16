# 1
```js
val numbers = List(1, 2, 3, 4, 5)
val sum = numbers.foldLeft(0)(_ + _)
println(sum)
```

# 2
```js
val strings = List("Hallo", " ", "Welt", "!")
val combinedString = strings.foldLeft("")(_ + _)
println(combinedString)
```

# 3
```js
val points = List((1, 3), (2, 5), (4, 8), (6, 2))

val centroid = points.foldLeft((0, 0)) { (acc, point) =>
  (acc._1 + point._1, acc._2 + point._2)
}

val numOfPoints = points.length
val centroidX = centroid._1 / numOfPoints
val centroidY = centroid._2 / numOfPoints

println((centroidX, centroidY))
```
