package org.example;

public class FizzBuzz {

    /**
     * FizzBuzz Anforderungen:
     * 1. Zahl durch 3 teilbar? = Fizz
     * 2. Zahl durch 5 teilbar? = Buzz
     * 3. Zahl durch 3&5 teilbar?  FizzBuzz
     * 4. Sonst Zahl als String! V
     */

    public static String play(int number) {
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        } else if (number % 5 == 0){
            return "Buzz";
        } else if (number % 3 == 0){
            return "Fizz";
        }
        return "" + number;
    }
}
