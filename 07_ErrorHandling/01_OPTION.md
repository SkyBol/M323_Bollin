# Aufgabe
Wie würden die beiden anderen Funktionen aussehen? Konkret:
```scala
def extractName(rawShow: String): Option[String]
def extractYearEnd(rawShow: String): Option[Int]
```
TITLE (YEAR_START - YEAR_END) 

### Lösung
```scala
def extractName(rawShow: String): Option[String] = {
  val bracketOpen = rawShow.indexOf('(')
  if (bracketOpen != -1) {
    Some(rawShow.substring(0, bracketOpen - 1).trim)
  } else {
    None
  }
}

def extractYearEnd(rawShow: String): Option[Int] = {
  val dash = rawShow.indexOf('-')
  val bracketClose = rawShow.indexOf(')')
  for {
    if dash != -1 && bracketClose > dash + 1
    yearStr = rawShow.substring(dash + 1, bracketClose).trim
    year <- yearStr.toIntOption
  } yield year
}
```
