package com.queen

object Queens {
  /*
    [
      [ ... ] // <-- a row
      [
        1, // <-- a column
        ...
      ]
    ];

    To access:
     Board[row][column];
   */
  private type Board = Array[Array[Int]] // Type declaration for a board of queens

  def solvedBoardWithQueens(boardLength: Int): List[Board] = {
    if (boardLength <= 0)
      return List.empty

    val board : Board = Array.ofDim[Int](boardLength, boardLength)

    solvedBoardRecursion(board, 0)
  }

  /**
   * Solves every possible Board-Position recursively
   * @param board A filled or empty board array
   * @param currentRow The amount
   * @return All possible Board positions
   */
  private def solvedBoardRecursion(board: Board, currentRow: Int): List[Board] = {
    val length = board.length

    // If current Column is larger than board
    // Stop recursion
    if (currentRow >= length) {
      return List(board)
    }

    // Get each possible column
    val possibleColumns = for {
      // Get each column
      column <- (0 until length).toList // To avoid IndexedIteration
      if positionPossible(board, currentRow, column)
    } yield column

    // Create a new Board for each possible column
    possibleColumns
      .map(possibleColumn => {
        val newBoard: Board = board.map(_.clone)
        newBoard.updated(currentRow, newBoard(currentRow).updated(possibleColumn, 1))
      })
      .flatMap(solvedBoardRecursion(_, currentRow + 1))
  }

  /**
   * Calculates if at the position a queen can be placed
   * @param board A filled board array
   * @param row The row position
   * @param column The column position
   * @return A boolean if a queen at the position is possible
   */
  private def positionPossible(board: Board, row: Int, column: Int): Boolean = {
    val columns = board.length

    board match {
      case arr if arr(row).sum > 0 => false
      case arr if arr.foldLeft(0){_ + _(column)} > 0 => false
      case arr if arr
        .zip(0 until columns)
        .foldLeft(0)(diagonalValue(board, row, column)) > 0 => false
      case _ => true
    }
  }

  /**
   * Calculates the amount of pieces diagonally of a position
   * @param board A filled board array
   * @param row The row position
   * @param column The column position
   * @return A foldLeft function parameter
   */
  private def diagonalValue(board: Board, row: Int, column: Int) : (Int, (Array[Int], Int)) => Int =
    (accumulator: Int, rowTuple: (Array[Int], Int)) => {
      val distanceRows = Math.abs(row - rowTuple._2)

      accumulator +
        rowTuple._1.lift(column - distanceRows).getOrElse(0) +
        rowTuple._1.lift(column + distanceRows).getOrElse(0)
    }
}
