package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number that you want to check if it's in the fibonacci sequence");
        int x = kb.nextInt();
        int count = 0;
        boolean b = false;
        for (int a = 0; a <= x; a++) {
            if (x == Fibonacci(a)) {
                System.out.println(x + " is a number in the Fibonacci sequence.");
                System.out.print("Here are the numbers that lead up to it: ");
                System.out.print(Fibonacci(0));
                for (int j = 1; j<x; j++){
                    System.out.print(", " + Fibonacci(j));
                }
                b = true;
                break;
            }
        }
        if (b==false){
            System.out.println(x + " is not a number in the fibonacci sequence.");
        }
    }

    public static int Fibonacci(int x) {
        if (x == 1 || x == 0) {
            return 1;
        } else {
            return Fibonacci(x - 1) + Fibonacci(x - 2);
        }
    }
}
