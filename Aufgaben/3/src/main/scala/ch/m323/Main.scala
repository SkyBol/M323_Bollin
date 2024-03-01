package ch.m323

// Functions have been automatically changed to scala functions

object Main extends App {
  private def calculateTipPercentage(names: String*) =
    if (names.length > 5) 20
      else if(names.length >= 0) 10
        else 0

  println(calculateTipPercentage("al"))
}
