# Aufgaben

```scala
// 1
val m1: Map[String, String] = Map("key" -> "value")

// 2
val m2 = m1 + ("key2" -> "value2")

// 3
val m3 = m2.updated("key2", "aDifferentValue")

// 4
val m4 = m3 - "key"

// 5
val valueFromM3: Option[String] = m3.get("key")

// 6
val valueFromM4: Option[String] = m3.get("nonExistentKey")
```