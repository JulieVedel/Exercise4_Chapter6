package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isAbecedarian(String word) {
        String testString = word.toLowerCase();
        for (int index = 1; index < testString.length(); index++) {
            if (testString.charAt(index - 1) < testString.charAt(index)) {
            } else {
                return false;

            }
        }
        return true;
    }
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String word = in.nextLine();
                boolean result = isAbecedarian(word);
                if (result) {
                    System.out.println(word + " is abecedarian");
                } else {
                    System.out.println(word + " is not abecedarian");
                }
            }
        }

