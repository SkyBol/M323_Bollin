package ch.m323

// Functions have been automatically changed to scala functions

object Main extends App {
  private def calculateScore(word: String) = {
    var score = 0
    for (c <- word.toCharArray) {
      if (!c.equals('a')) {
        score += 1
      }
    }
    score
  }
  private def wordScore(word: String) = word.replaceAll("a", "").length


  println("I love Scala!")

  println(calculateScore("imperative"))
  println(calculateScore("no"))
  println(wordScore("declarative"))
  println(wordScore("yes"))

}
