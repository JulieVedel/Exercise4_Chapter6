package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isAbecedarian(String word) { // ny metode, som bruger en string og returnerer en boolean.
        String testString = word.toLowerCase(); // ordet fra scanneren vil blive tildelt en ny variable. Dette kunne gøres oppe i metoden i stedet for.
        for (int index = 1; index < testString.length(); index++) { // for statement, index er 1, fortsætter indtil index er det samme som længden og hver gang vil index få +1.
            if (testString.charAt(index - 1) < testString.charAt(index)) { // hvis bogstavet ved index - 1 er lavere end bogstavet ved index (kommer før i alfabetet) -> true.
            } else {
                return false; // hvis ikke -> false.

            }
        }
        return true;
    }
            public static void main(String[] args) { // her starter programmet, ved main.
                Scanner in = new Scanner(System.in); // har lavet en scanner.
                String word = in.nextLine(); // ordet som scanneren opfanger vil blive lavet til en string, som hedder word.
                boolean result = isAbecedarian(word); // opretter en boolean, som får værdien som kommer fra metoden isAbecedarian.
                if (result) {
                    System.out.println(word + " is abecedarian"); // hvis resultatet er true vil den udskrive ordet og "is abecedarian".
                } else {
                    System.out.println(word + " is not abecedarian"); // hvis resultatet er false vil den udskrive ordet og "is not abecedarian".
                }
            }
        }

