# A1

```js
[1,2,3,4,5].map((e) => e * 2);
```

# 2
```js
["Alice", "Bob", "Charlie"].map((e) => e.toUpperCase());
```

# 3
```js
[12, 45, 68, 100].map((e) => e / 2);
```

# 4
```js
[
    {
        strasse: "Hauptstrasse",
        hausnummer: 10,
        postleitzahl: "12345",
        stadt: "Musterstadt"
    },
    {
        strasse: "Nebenstrasse",
        hausnummer: 5,
        postleitzahl: "23456",
        stadt: "Beispielburg"
    }
].map((e) => `${e.strasse} ${e.hausnummer}, ${e.postleitzahl} ${e.stadt}`);
```

# 5
```js
["Max Mustermann", "Erika Mustermann"].map((e) => e.split(" ")[0]);
```
