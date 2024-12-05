package org.example.task1;

import java.util.Scanner;

//The task is a sequence of Catalan numbers
public abstract class NumbersOfBrackets {
    //method for determining Catalan number
       public static int determineTheNumber(int n){
        int c = 0;//assign an initial value of 0 to the Catalan number

        // according to the formula
        if (n==0){
            return 1;
        }
        // Calculating a number from the Catalan series
        for (int i = 0; i < n; i++){
            c+=determineTheNumber(i)*determineTheNumber((n-1)-i);//use recursion

        }
        return c;
    }
        public static void scannerForInputNum(){
            Scanner sk = new Scanner(System.in);//create a new object of class Scanner
            System.out.println("Enter the number");
            int s = sk.nextInt();//read the numbers entered from the keyboard
            System.out.println("Number of correct bracket expressions = " +
                    NumbersOfBrackets.determineTheNumber(s));//outputting the result to the console
        }
}
