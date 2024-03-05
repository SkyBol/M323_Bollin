package ch.m323

// Functions have been automatically changed to scala functions

object Main extends App {
  private def userInput() = scala.io.StdIn.readLine()

  println("1 - Route Planner")
  println("2 - RaceCar Time Tracker")

  val a: String = userInput()

  a match {
    case "1" => RoutePlanner.program(List())
    case "2" => RaceCarTracker.program(List())
  }
}
