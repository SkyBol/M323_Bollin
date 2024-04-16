# 1
```js
val squaredNumbers = for {
  number <- 1 to 10
} yield number * number

println(squaredNumbers)
```

# 2
```js
val evenNumbers = for {
  number <- 1 to 20
  if number % 2 == 0
} yield number

println(evenNumbers)
```

# 3
```js
val colors = List("Red", "Green", "Blue")
val fruits = List("Apple", "Banana", "Orange")

val combinations = for {
  color <- colors
  fruit <- fruits
} yield (color, fruit)

println(combinations)
```

# 4
```js
case class User(name: String, tasks: List[String])

val users = List(
  User("Alice", List("Task 1", "Task 2", "Task 3")),
  User("Bob", List("Task 1", "Task 4", "Task 5")),
  User("Charlie", List("Task 2", "Task 3", "Task 6"))
)

val tasksCompleted = List("Task 1", "Task 3", "Task 5")

val pendingTasks = for {
  user <- users
  task <- user.tasks
  if !tasksCompleted.contains(task)
} yield (user.name, task)

println(pendingTasks)
```
