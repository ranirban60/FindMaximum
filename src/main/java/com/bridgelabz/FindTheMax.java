/*
Find the maximum using Generic Class
 */
package com.bridgelabz;

    public class FindTheMax<N extends Comparable<N>>{
        public N num1, num2, num3;

        public FindTheMax(N num1, N num2, N num3) {
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
        }

        public FindTheMax() {
        }

        public static <N extends Comparable<N>> N maxNumber(N num1, N num2, N num3) {
            if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
                return num1;
            } else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
                return num2;
            } else
                return num3;
        }
        public <T extends Comparable <T>> T testMaximum() {
            return (T) FindTheMax.maxNumber(num1, num2, num3);
        }



        public static void main(String[] args) {
            FindTheMax compareInteger = new FindTheMax(3, 5, 7);
            System.out.println("Maximum number out of three integers is: " + compareInteger.testMaximum());
            FindTheMax comapreFloat = new FindTheMax (3.0f, 5.0f, 7.0f);
            System.out.println("Maximum number out of three float is: " + comapreFloat.testMaximum());
            FindTheMax compareString = new FindTheMax("Apple", "Grapes", "Banana");
            System.out.println("Maximum among three string is: " + compareString.testMaximum());
        }
    }
