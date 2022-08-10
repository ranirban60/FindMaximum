/*
Extend the max method to take more than three parameters
 */
package com.bridgelabz;

import java.util.Arrays;

public class FindTheMax<N extends Comparable<N>>{
        private N[] inputArray;

        public FindTheMax(N[] inputArray) {//Generics method to accept type from Generics class Array
            this.inputArray = inputArray;//Converting into this method Object
        }
        public void maxElement(){
          for(int i = 0 ; i < inputArray.length - 1; i++ ){
              if (inputArray[i].compareTo(inputArray[i+1]) > 0){
                  inputArray[i + 1] = inputArray[i];
              }
          }
            System.out.println(inputArray[inputArray.length - 1]);
        }
        public void display() {
            for (int i = 0; i < inputArray.length; i++) {
                System.out.println(inputArray[i]);//Before sorting display the input
            }
            Arrays.sort(inputArray);
            System.out.println();
            System.out.println("After sorting : ");
            for(int i = 0; i< inputArray.length; i++){
                System.out.println(inputArray[i]);//After sorting display the output
            }
        }
        public static void main(String[] args) {
         Integer[] i = {3, 55, 7, 15, 57};
         Float[] f = {3.0f,1357.57f, 357.97f, 987.08f, 457.753f};
         String[] s = {"Apple", "Mango", "Grapes", "PineApple", "Watermelon"};
         System.out.println("-:Integer:-");
         new FindTheMax(i).display();
         System.out.println();
         System.out.println("-:Float:-");
         new FindTheMax(f).display();
         System.out.println();
         System.out.println("-:String:-");
         new FindTheMax(s).display();
         System.out.println();
         System.out.println("Maximum from all values:");
         new FindTheMax(i).maxElement();
         new FindTheMax(f).maxElement();
         new FindTheMax(s).maxElement();
        }
    }
