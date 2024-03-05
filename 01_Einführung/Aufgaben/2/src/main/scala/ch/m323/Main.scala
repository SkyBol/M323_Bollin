package ch.m323

// Functions have been automatically changed to scala functions

object Main extends App {
  // Setup Imperative
  var shoppingCartImperative: ShoppingCartImperative = new ShoppingCartImperative()
  shoppingCartImperative.addItem("Bee")
  shoppingCartImperative.addItem("Hotas-System")
  shoppingCartImperative.addItem("Helldivers II")

  private def getDiscountPercentage(shoppingCart: String*): Integer = if (shoppingCart.contains("book")) 5 else 0

  println("Imperative")
  println(shoppingCartImperative.getDiscountPercent, "expected 0%")
  shoppingCartImperative.addItem("book")
  println(shoppingCartImperative.getDiscountPercent, "expected 5%")

  println

  println("Declarative")
  println(getDiscountPercentage("Test", "Test2"), "expected 0%")
  println(getDiscountPercentage("Test", "book"), "expected 5%")
}
