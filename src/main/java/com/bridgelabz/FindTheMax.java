/*
Extend the max method to also print the max to std out using Generic method
 */
package com.bridgelabz;

public class FindTheMax<N extends Comparable<N>>{
        private N[] inputArray;

        public FindTheMax(N[] inputArray) {//Generics method to accept type from Generics class Array
            this.inputArray = inputArray;//Converting into this method Object
        }

    public void testMaximum() {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i].compareTo(inputArray[i + 1]) > 0) {
                inputArray[i + 1] = inputArray[i];
            }
        }
    }
    private void toPrint() {
        System.out.println(inputArray[inputArray.length - 1]);
    }

        public static void main(String[] args) {
         Integer[] i = {3, 55, 7, 15, 57};
         Float[] f = {3.0f,1357.57f, 357.97f, 987.08f, 457.753f};
         String[] s = {"Apple", "Mango", "Grapes", "PineApple", "Watermelon"};
            new FindTheMax(i).testMaximum();
            new FindTheMax(s).testMaximum();
            new FindTheMax(f).testMaximum();
            new FindTheMax(i).toPrint();
            new FindTheMax(s).toPrint();
            new FindTheMax(f).toPrint();
        }
    }
