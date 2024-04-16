# 1
```js
val listOfLists = List(List(1, 2), List(3, 4), List(5, 6))

val doubledList = listOfLists.flatMap(_.map(_ * 2))

println(doubledList)
```

# 2
```js
val people = List(("Max", List("Blau", "Grün")), ("Anna", List("Rot")), ("Julia", List("Gelb", "Blau", "Grün")))

val uniqueColors = people.flatMap(_._2).distinct

println(uniqueColors)
```