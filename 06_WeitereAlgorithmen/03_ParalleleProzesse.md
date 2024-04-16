# Aufgaben

## Code 1
```scala
for {
    _ <- IO.sleep(1.second)
    result <- List(rollDice(), rollDice()).parSequence
} yield result.sum
```
Dieser Code wartet eine Sekunde, führt dann zwei Würfelwürfe parallel aus und berechnet die Summe der beiden Ergebnisse.

## Code 2
```scala
for {
    storedCasts <- Ref.of[IO, List[Int]](List.empty)
    singleCast = rollDice()
    .flatMap(result => storedCasts.update(_.appended(result)))
    _ <- List(singleCast, singleCast).parSequence
    casts <- storedCasts.get
} yield casts
```
Dieser Code führt zweimal einen Würfelwurf parallel aus, speichert die Ergebnisse in einem Ref und gibt am Ende die gespeicherten Ergebnisse zurück.

## Code 3
```scala
for {
    storedCasts <- Ref.of[IO, List[Int]](List.empty)
    singleCast = rollDice()
    .flatMap(result => storedCasts.update(_.appended(result)))
    _ <- List.fill(3)(singleCast).parSequence
    casts <- storedCasts.get
} yield casts
```
Dieser Code führt dreimal einen Würfelwurf parallel aus, speichert die Ergebnisse in einem Ref und gibt am Ende die gespeicherten Ergebnisse zurück.

## Code 4
```scala
for {
    storedCasts <- Ref.of[IO, Int](0)
    singleCast = rollDice().flatMap(result => if (result == 6) storedCasts.update(_ + 1) else IO.unit)
    _ <- List.fill(100)(singleCast).parSequence
    casts <- storedCasts.get
} yield casts
```
Dieser Code führt 100 Mal einen Würfelwurf parallel aus und zählt, wie oft die Zahl 6 gewürfelt wurde.

## Code 5
```scala
List.fill(100)(IO.sleep(1.second).flatMap(_ => rollDice())).parSequence.map(_.sum)
```
Dieser Code führt 100 Mal einen Würfelwurf mit einer Sekunde Pause zwischen den Würfen aus, sammelt die Ergebnisse und berechnet dann die Summe der Würfelergebnisse.