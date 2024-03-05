package ch.m323

// Functions have been automatically changed to scala functions

object Main extends App {
  private def calculateTipPercentage(names: String*) =
    if (names.length > 5) 20
      else if(names.length >= 0) 10
        else 0

  println(calculateTipPercentage(), "expected 0%")
  println
  println(calculateTipPercentage("Fred"), "expected 10%")
  println(calculateTipPercentage("Fred", "Frank"), "expected 10%")
  println(calculateTipPercentage("Fred", "Frank", "Finn", "Funk"), "expected 10%")
  println(calculateTipPercentage("Fred", "Frank", "Finn", "Funk", "Fund"), "expected 10%")
  println
  println(calculateTipPercentage("Fred", "Frank", "Finn", "Funk", "Fund", "Finally"), "expected 20%")
  println(calculateTipPercentage("Fred", "Frank", "Finn", "Funk", "Fund", "Finally", "Fink"), "expected 20%")
}
