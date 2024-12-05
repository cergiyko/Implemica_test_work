package org.example.task3;

import java.math.BigInteger;

public abstract class Factorial {
    public static int factNam(int num){
        int sum = 0;//starting value of the sum of the digits
        BigInteger fact = BigInteger.ONE;
        //determine the factorial of the number 100
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        //convert biginteger to string
        String digits = String.valueOf(fact);
        //iterate over the characters of the string, convert them to numbers, calculate the sum
        for (int i = 0; i <digits.length(); i++) {
            sum += Integer.parseInt(String.valueOf(digits.charAt(i)));
        }
        System.out.println("The sum of the digits in the number " + num +"! = " +sum);

        return sum;
    }
}
