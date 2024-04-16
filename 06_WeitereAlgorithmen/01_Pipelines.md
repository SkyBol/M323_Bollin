# Aufgabe
```scala
case class Course(title: String, students: List[String])

val courses = List(
    Course("M323", List("Peter", "Petra", "Paul", "Paula")),
    Course("M183", List("Paula", "Franz", "Franziska")),
    Course("M117", List("Paul", "Paula")),
    Course("M114", List("Petra", "Paul", "Paula")),
)

println(courses.map(_.students).filter(_.contains("Peter")).size) // 1
println(courses.map(_.students).filter(_.contains("Petra")).size) // 2
```

#### Erwartet:
Peter besucht folgende Module: M323
Petra besucht folgende Module: M323, M114

```scala
case class Course(title: String, students: List[String])

val courses = List(
    Course("M323", List("Peter", "Petra", "Paul", "Paula")),
    Course("M183", List("Paula", "Franz", "Franziska")),
    Course("M117", List("Paul", "Paula")),
    Course("M114", List("Petra", "Paul", "Paula")),
)

val peterModules = courses.filter(_.students.contains("Peter")).map(_.title)
val petraModules = courses.filter(_.students.contains("Petra")).map(_.title)

println(s"Peter besucht folgende Module: ${peterModules.mkString(", ")}")
println(s"Petra besucht folgende Module: ${petraModules.mkString(", ")}")

val courseSubscriptions = courses.map(course => CourseSubscriptions(course.title, course.students.size))
println(courseSubscriptions)

```