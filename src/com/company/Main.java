package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number that you want to check if it's in the fibonacci sequence");
        int x = kb.nextInt();
        for (int a = 0; a<=x; a++){
            if (x == Fibonacci(a)){
                System.out.println(x + " is a number in the Fibonacci sequence.");
                
            }
        }
    }
    public static int Fibonacci(int x){
        if(x==1 || x==0){
            return 1;
        }
        else{
            return Fibonacci(x-1)+Fibonacci(x-2);
        }
    }
}
