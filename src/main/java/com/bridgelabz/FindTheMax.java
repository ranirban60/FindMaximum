/*
Find the maximum using Generic Method
 */
package com.bridgelabz;

public class FindTheMax {
    public static <N extends Comparable> N maxNumber(N num1, N num2, N num3) {
        if (num1.compareTo(num2) > 0 && num2.compareTo(num3) > 0) {
            return num1;
        } else if (num2.compareTo(num1) > 0 && num1.compareTo(num3) > 0) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        System.out.println("Maximum number of three Integers is " + maxNumber(3, 5, 7));
        System.out.println("Maximum number of three Floats is " + maxNumber(3.0f, 5.0f, 7.0f));
        System.out.println("Maximum number of three Strings is " + maxNumber("Apple", "Peach", "Banana"));
    }
}