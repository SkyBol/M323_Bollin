# 1
```js
[
  { name: "Max Mustermann", abteilung: "IT", gehalt: 50000 },
  { name: "Erika Musterfrau", abteilung: "Marketing", gehalt: 45000 },
  { name: "Klaus Klein", abteilung: "IT", gehalt: 55000 },
  { name: "Julia Gross", abteilung: "HR", gehalt: 40000 }
]
    .filter((e) => e.gehalt > 50000)
    .map((e) => e.name.split(" ")[0].toUpperCase());
```

# 2
```js
[
    "Programmierung in Scala",
    "Datenbanken",
    "Webentwicklung mit JavaScript",
    "Algorithmen und Datenstrukturen"
]
    .filter((e) => e.toLowerCase().includes("daten"))
    .map((e) => e.replaceAll(" ", ""))
    .sort((a, b) => a.localeCompare(b))
    .sort((a, b) => b.localeCompare(a))
```