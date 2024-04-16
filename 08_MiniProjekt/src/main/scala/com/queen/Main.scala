package com.queen

import com.queen.Queens.solvedBoardWithQueens

object Main {
  def main(args: Array[String]): Unit = {
    val n = 8
    val solutions = solvedBoardWithQueens(n)

    println("Found " + solutions.length + " possible solutions!")
    if (solutions.nonEmpty)
      printSolution(solutions.head)
  }

  private def printSolution(board: Array[Array[Int]]): Unit = {
    val n = board.length
    for (i <- 0 until n) {
      for (j <- 0 until n) {
        print(" " + board(i)(j) + " ")
      }
      println()
    }
  }
}
