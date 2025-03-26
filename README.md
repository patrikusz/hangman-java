# Akasztófa Játék

Ez egy egyszerű akasztófás játék, amelyet konzolon lehet játszani.

## Használat

1. Futtasd a `Main` osztályt.
2. A játék üdvözöl, és megkér, hogy adj meg egy betűt.
3. A játék állapota frissül minden találgatás után.
4. A játék akkor ér véget, ha kitalálod a szót vagy elfogynak a lehetőségeid.

## Fájlok

- `Main.java`: A fő osztály, amely elindítja a játékot.
- `Hangman.java`: Az akasztófa játék logikáját tartalmazó osztály.
- `HangmanKivetel.java`: Kivételkezelés a játékhoz.
- `HangmanTest.java`: Egységtesztek a játékhoz.

## Követelmények

- Java 8 vagy újabb verzió

## Fordítás és futtatás

A projekt fordításához és futtatásához használd az alábbi parancsokat:

```sh
javac Main.java Hangman.java HangmanKivetel.java
java Main