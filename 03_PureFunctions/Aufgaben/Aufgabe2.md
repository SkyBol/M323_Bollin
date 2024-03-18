### Aufgabe 2.1 - Impure => Pure
JavaScript:
```

function addToCart(cartItems, item) {
    cartItems.push(item);
    return cartItems;
}

console.log(addToCart([], 'Apple'));  // Ausgabe: ['Apple']
console.log(addToCart(['Apple'], 'Banana')); // Ausgabe: ['Apple', 'Banana']
console.log(addToCart(['Apple', 'Banana'], 'Orange')); // Ausgabe: ['Apple', 'Banana', 'Orange']
```

Scala:
```
def addToCart(cartItems: List[String], item: String): List[String] = {
    cartItems += item
    cartItems.toList
}

println(addToCart(List(), "Apple"))   // Ausgabe: List(Apple)
println(addToCart(List("Apple"), "Banana"))  // Ausgabe: List(Apple, Banana)
println(addToCart(List("Apple", "Banana"), "Orange"))  // Ausgabe: List(Apple, Banana, Orange)
```

### Aufgabe 1.3 - Pure (not by Exception)
JavaScript:
```js
function firstCharacter(str) {
    if (str.length) {
        return "";
    }
    return str.charAt(0);
}

console.log(firstCharacter("Hello")); // Ausgabe: H
console.log(firstCharacter("JavaScript")); // Ausgabe: J
```

### Aufgabe 2.4 - Impure => Pure
JavaScript:
```js
// Methode, um eine Zahl mit einem zufälligen Wert zu multiplizieren
function multiplyWithRandom(number, randomValue) {
    return number * randomValue;
}

console.log(multiplyWithRandom(5, Math.random())); // Ausgabe: Eine zufällige Zahl zwischen 0 und 5
console.log(multiplyWithRandom(10, Math.random())); // Ausgabe: Eine zufällige Zahl zwischen 0 und 10
```

Scala:
```
import scala.util.Random

// Methode, um eine Zahl mit einem zufälligen Wert zu multiplizieren
def multiplyWithRandom(number: Double, randomValue: Double): Double = {
  number * randomValue
}

println(multiplyWithRandom(5, Random.nextDouble())) // Ausgabe: Eine zufällige Zahl zwischen 0 und 5
println(multiplyWithRandom(10, Random.nextDouble())) // Ausgabe: Eine zufällige Zahl zwischen 0 und 10
```

### Aufgabe 2.5 - Pure (not by Exception)
JavaScript:
```js
// Funktion zum Teilen einer Zahl durch eine andere
function divideNumbers(dividend, divisor) {
    if (divisor === 0)
        return 0;
    return dividend / divisor;
}

console.log(divideNumbers(10, 2)); // Ausgabe: 5
console.log(divideNumbers(8, 4));  // Ausgabe: 2
```

### Aufgabe 2.6 - Impure => Pure
JavaScript:
```js
// Methode zum Ausgeben und Rückgeben einer Zeichenkette
function printAndReturnString(str) {
    return str;      // Rückgabe der Zeichenkette
}

console.log(printAndReturnString("Hello")); // Ausgabe: Hello
```

Scala:
```
// Methode zum Ausgeben und Rückgeben einer Zeichenkette
def printAndReturnString(str: String): String = {
  str          // Rückgabe der Zeichenkette
}

println(printAndReturnString("Hello")) // Ausgabe: Hello
```

