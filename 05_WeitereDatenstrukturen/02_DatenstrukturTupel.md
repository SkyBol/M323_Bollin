# Aufgabe 1
```scala
def wetterFunktion(): (String, LocalTime, Double) = {
  val wetterbeschreibung = "sonnig" // Beispielwert
  val currentTime = LocalTime.now()
  val temperatur = 25.0 // Beispielwert
  
  (wetterbeschreibung, currentTime, temperatur)
}
```

```scala
val wetterdaten: List[(String, LocalTime, Double)] = List(
  ("Stadt1", LocalTime.of(9, 0), 18.0),
  ("Stadt2", LocalTime.of(10, 30), 22.5),
  ("Stadt3", LocalTime.of(12, 15), 17.8),
  // Weitere Daten hier hinzufügen
)

def städteÜberTemperatur(temperatur: Double): List[String] = {
  wetterdaten.filter(_._3 > temperatur).map(_._1)
}

// Beispielaufruf
val städteÜber20Grad = städteÜberTemperatur(20.0)
println("Städte über 20 Grad: " + städteÜber20Grad.mkString(", "))
```