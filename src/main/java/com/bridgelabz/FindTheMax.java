/*
Given three Floats Find the maximum
 */
package com.bridgelabz;

import java.util.Scanner;//Scanner class is used to take user input

public class FindTheMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Floats : ");

        float a = sc.nextFloat();//nextInt() method scans the next token of the Input as int
        float b = sc.nextFloat();//nextInt() method scans the next token of the Input as int
        float c = sc.nextFloat();//nextInt() method scans the next token of the Input as int

        Float i1 = a;
        Float i2 = b;
        Float i3 = c;

        int result1 = i1.compareTo(i2);//compare between two Float by compareTo() method
        int result2 = 0;
        int result3 = 0;
        if(result1 < 0){
            result2 = i2.compareTo(i3);//compare between two Float by compareTo() method
        }else if(result1 > 0){
            result3 = i1.compareTo(i3);//compare between two Float by compareTo() method
        }else{
            result2 = i1.compareTo(i3);//compare between two Float by compareTo() method
        }
        if(result2 > 0){
            System.out.println("Max for all three Float is "+" "+b);
        }else if(result2 < 0){
            System.out.println("Max for all three Float is "+" "+c);
        }else if(result3 > 0){
            System.out.println("Max for all three Float is "+" "+a);
        }else if(result3 < 0){
            System.out.println("Max for all three Float is "+" "+c);
        }else{
            System.out.println("Max for all three Float is "+" "+a);
        }
    }
}
