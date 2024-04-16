package ch.m323

// Functions have been automatically changed to scala functions

object Main extends App {

  // Math has no functions for percentage
  private def valueWithPercentage(x: Integer) = x * 0.95

  println(valueWithPercentage(100));
  println(valueWithPercentage(-1000));
  println(valueWithPercentage(999));

}
