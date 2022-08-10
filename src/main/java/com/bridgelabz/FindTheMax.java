/*
Given three Integer Find the maximum
 */
package com.bridgelabz;

import java.util.Scanner;//Scanner class is used to take user input

public class FindTheMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Integer : ");

        int a = sc.nextInt();//nextInt() method scans the next token of the Input as int
        int b = sc.nextInt();//nextInt() method scans the next token of the Input as int
        int c = sc.nextInt();//nextInt() method scans the next token of the Input as int

        Integer i1 = a;
        Integer i2 = b;
        Integer i3 = c;

        int result1 = i1.compareTo(i2);//compare between two integer by compareTo() method
        int result2 = 0;
        int result3 = 0;
        if(result1 < 0){
            result2 = i2.compareTo(i3);//compare between two integer by compareTo() method
        }else if(result1 > 0){
            result3 = i1.compareTo(i3);//compare between two integer by compareTo() method
        }else{
            result2 = i1.compareTo(i3);//compare between two integer by compareTo() method
        }
        if(result2 > 0){
            System.out.println("Max for all three Integer is "+" "+b);
        }else if(result2 < 0){
            System.out.println("Max for all three Integer is "+" "+c);
        }else if(result3 > 0){
            System.out.println("Max for all three Integer is "+" "+a);
        }else if(result3 < 0){
            System.out.println("Max for all three Integer is "+" "+c);
        }else{
            System.out.println("Max for all three Integer is "+" "+a);
        }
    }
}
