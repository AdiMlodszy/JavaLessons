# JAVA – Zadania domowe (IV semestr)

Ten projekt zawiera **trzy kompletne zadania programistyczne zrealizowane w języku Java**. Każde zadanie prezentuje inne aspekty programowania obiektowego oraz operacji na tablicach, macierzach i prostych algorytmach.
Kod napisany z podziałem na czytelne klasy, dokumentacją i przykładowymi testami.

---

## Spis treści

1. [MatrixMultiplier – operacje na macierzach](#1-matrixmultiplier--operacje-na-macierzach)
2. [StudentScoresAnalysis – analiza ocen studentów](#2-studentscoresanalysis--analiza-ocen-studentów)
3. [AdvancedCalculator – zaawansowany kalkulator z obsługą wyjątków](#3-advancedcalculator--zaawansowany-kalkulator-z-obsługą-wyjątków)

---

## 1. MatrixMultiplier – operacje na macierzach

**Opis:**
Program tworzy dwie macierze 5x5 z losowymi liczbami od 0 do 10, mnoży je zgodnie z zasadami algebry liniowej, **pomijając wiersze w pierwszej macierzy, które zawierają przynajmniej jedno zero**. Wynik działania oraz poszczególne macierze są wyświetlane w czytelnej formie na konsoli.

**Najważniejsze cechy:**

* Wykorzystuje pętle zagnieżdżone do generowania i mnożenia macierzy.
* Podział na klasy główne i pomocnicze.
* Optymalizacja poprzez pomijanie niepotrzebnych obliczeń.

---

## 2. StudentScoresAnalysis – analiza ocen studentów

**Opis:**
Program generuje losową macierz ocen 10 studentów (każdy z 5 ocenami, oceny od 2 do 5). Dla każdego studenta **oblicza średnią, ocenę minimalną i maksymalną**. Wyniki prezentowane są w formie czytelnej tabeli na konsoli.

**Najważniejsze cechy:**

* Podział na klasy modelowe (student, wynik) oraz helpersy do obliczeń.
* Użycie pętli i formatowania danych wyjściowych.
* Przykład czytelnego projektowania kodu pod analizę danych.

---

## 3. AdvancedCalculator – zaawansowany kalkulator z obsługą wyjątków

**Opis:**
Zaawansowany kalkulator, który obsługuje podstawowe operacje arytmetyczne (dodawanie, odejmowanie, mnożenie, dzielenie, potęgowanie, pierwiastkowanie), a dodatkowo **obsługuje sytuacje wyjątkowe** (np. dzielenie przez zero, pierwiastkowanie z liczby ujemnej, 0^0 itd.).
Projekt pokazuje stosowanie **interfejsów, dziedziczenia, helpersów statycznych** i programowania polimorficznego.

**Najważniejsze cechy:**

* Klasa bazowa z podstawową implementacją (bez obsługi wyjątków).
* Klasa dziedzicząca z obsługą błędów i komunikatami na konsoli.
* Interfejs `ICalculator` do programowania polimorficznego.
* Główny program testowy (`Main.java`), który uruchamia przykładowe operacje.

---

## Budowanie i uruchamianie

Skompiluj wszystkie pliki w wybranym katalogu:

```
javac *.java
```

Następnie uruchom program startowy danej części, np.:

```
java MatrixMultiplier
java StudentScoresAnalysis
java Main           # (dla kalkulatora)
```

---

## Podsumowanie

Projekt prezentuje różne podejścia do rozwiązywania zadań programistycznych w Javie:

* Operacje na macierzach i tablicach
* Analiza i prezentacja danych liczbowych
* Stosowanie OOP: interfejsów, dziedziczenia, helpersów i polimorfizmu
* Obsługa błędów oraz programowanie zgodne z dobrymi praktykami

Kod nadaje się zarówno do nauki, jak i jako wzór na zaliczenie/przegląd podstaw programowania w Javie.
