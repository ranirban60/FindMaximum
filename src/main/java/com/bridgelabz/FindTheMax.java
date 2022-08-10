/*
Given three Strings Find the maximum
 */
package com.bridgelabz;

import java.util.Scanner;//Scanner class is used to take user input

public class FindTheMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three String : ");

        String s1 = sc.nextLine();//nextLine() method advances this scanner past the current line and returns the input that was skipped
        String s2 = sc.nextLine();//nextLine() method advances this scanner past the current line and returns the input that was skipped
        String s3 = sc.nextLine();//nextLine() method advances this scanner past the current line and returns the input that was skipped


        int result1 = s1.compareTo(s2);
        int result2=0;
        int result3=0;
        if (result1 < 0) {
            result2 = s2.compareTo(s3);
        } else if (result1 > 0) {
            result3 = s1.compareTo(s3);
        } else {
            result2 = s1.compareTo(s3);
        }
        if (result2 > 0) {
            System.out.println("Max for all three strings are"+" "+s2);
        } else if (result2 < 0) {
            System.out.println("Max for all three strings are"+" "+s3);
        } else if (result3>0){
            System.out.println("Max for all three strings are"+" "+s1);
        }
        else if(result3<0) {
            System.out.println("Max for all three strings are"+" "+s3);
        }
        else {
            System.out.println("Max for all three strings are"+" "+s1);
        }

    }
}
