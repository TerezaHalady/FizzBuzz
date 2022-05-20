package com.engeto.Lekce3;

public class Main {

    public static void main(String[] args) {
//čísla od 1 - 100
// čísla dělitelné 3 nahraď slovem = Fizz
// čísla dělitelné 5 nahraď slovem= Buzz
//  čísla dělitelné 3 a 5 (=15) nahraď slovem = FizzBuzz

       for (int i = 1; i <= 100; i++){            // cyklus pro pevný počet opakování
           if (i % 15 == 0) {System.out.println("FizzBuzz");}     //největší číslo musí být na začátku,
         else if (i % 3 == 0) {System.out.println("Fizz");}             // jinak se propíše podmínka, která je napsaná dříve
         else if (i % 5 == 0) {System.out.println("Buzz");}
          else System.out.println(i);       // Jestliže nenarazíš na podmínku vypiš číslo proměnné i
                                            // výpis čísel musí být až na konci, jinak by se FiZZ
                                            // a Bizz vypisovali s číslem

        }
    }
}
