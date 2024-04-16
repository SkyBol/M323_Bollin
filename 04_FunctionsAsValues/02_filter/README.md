# 1
```js
[1, 2, 3, 4, 5].filter((e) => e % 2 === 0);
```

# 2
```js
["Alice", "Bob", "Charlie", "Diana"].filter((e) => e.length > 4);
```

# 3
```js
[12, 45, 68, 100].filter((e) => e > 50);
```

# 4
```js
["Scala", "ist", "fantastisch"].filter((e) => e.charAt(0) === "S");
```

# 5
```js
[
    {
        titel: "1984",
        autor: "George Orwell",
        jahr: 1949
    },
    {
        titel: "Brave New World",
        autor: "Aldous Huxley",
        jahr: 1932
    },
    {
        titel: "Fahrenheit 451",
        autor: "Ray Bradbury",
        jahr: 1953
    }
].filter((e) => e.jahr < 1950);
``` 