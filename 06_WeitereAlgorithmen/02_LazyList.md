# Aufgaben
1. Eine LazyList, die von 1 an weiterzählt (also 1, 2, 3, 4, ... usw.)
2. Eine LazyList, die die 2er-Reihe generiert (also 2, 4, 6, 8 ... usw.)
3. Eine LazyList, die die 2er-Potenz generiert (also 2, 4, 8, 16, 32 ... usw.)
4. Eine LazyList, die die Buchstaben der Reihenfolge nach "zählt" (also a, b, c, ... aa, ab, ac ... usw.)
5. Schreiben Sie eine LazyList, die Zufallszahlen von 1 bis 6 generiert (Tipp: Arbeiten Sie mit IO)

```scala
val countingLazyList: LazyList[Int] = LazyList.from(1) // 1
val evenNumbersLazyList: LazyList[Int] = LazyList.from(2, step = 2) // 2
val powerOfTwoLazyList: LazyList[Int] = LazyList.from(1).map(x => Math.pow(2, x).toInt) // 3
val alphabetLazyList: LazyList[String] = LazyList.from('a')
    .map(_.toString)
    .flatMap { letter =>
        LazyList.from('a').map(_.toString).map(letter + _)
    } // 4

import scala.util.Random
val randomNumbersLazyList: LazyList[Int] = LazyList.continually(Random.nextInt(6) + 1) // 5
```