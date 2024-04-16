package ch.m323

/**
 * Wir planen eine Reise durch Europa und möchten, dass der Benutzer jeweils die Destinationen für die Reise eingibt.
 * Zudem soll es möglich sein, eine bereits festgelegte Route zu ändern (z.Bsp. wenn Ihr Freund noch einen anderen Zwischenaufenthalt möchte).
 *
 * -> String-Liste von allen Destinationen
 * Liste Sollte bearbeitbar sein
 */

object RoutePlanner {
  private def addDestination(destinations: List[String], newDestination: String) = destinations.appended(newDestination)
  private def insertDestinationBeforeIndex(destinations: List[String], index: Integer, newDestination: String) =
    destinations.take(index) ++ List(newDestination) ++ destinations.drop(index)
  private def setDestinationAtIndex(destinations: List[String], index: Integer, newDestination: String) =
    destinations.updated(index, newDestination)

  // Input / Output
  private def userInput() = scala.io.StdIn.readLine()
  private def printOptions(destinations: List[String]): Unit = {
    println
    println("All Destinations")
    println(destinations)
    println
    println("1 - Add Destination")
    println("2 - Change Destination")
    println("3 - Quit")
  }
  private def printListWithIndexes(destinations: List[String]): Unit =
    destinations.zipWithIndex.foreach { case (element, index) =>
      println(s"$index - $element")
    }
  private def printListChangeOptions(): Unit = {
    println
    println("1 - Change Destination at Index")
    println("2 - Insert new Destination before Index")
    println("3 - Cancel")
  }

  private def changeValue(destinations: List[String]): Unit = {
    printListChangeOptions()
    val a: String = userInput()

    if (a.contains("1")) {
      printListWithIndexes(destinations)

      println("Updated Destination")
      val newDestination = userInput()

      println("For Index")
      val index = userInput()

      program(setDestinationAtIndex(destinations, index.charAt(0).asDigit, newDestination))
    }

    if (a.contains("2")) {
      printListWithIndexes(destinations)

      println("New Destination")
      val newDestination = userInput()

      println("Before Index")
      val index = userInput()

      program(insertDestinationBeforeIndex(destinations, index.charAt(0).asDigit, newDestination))
    }

    if (a.contains("3"))
      program(destinations)
  }
  def program(destinations: List[String]): Unit = {
    printOptions(destinations)

    val a: String = userInput()

    if (a.contains("1")) {
      println("Enter new Destination")
      program(addDestination(destinations, userInput()))
    }
    if (a.contains("2"))
      changeValue(destinations)
  }
}
