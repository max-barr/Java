import java.util.ArrayList;

public class BasicAlgos {
    
    // Write a method that prints all the numbers from 1 to 255.
    public void printNums() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    // Write a method that prints all the odd numbers from 1 to 255.
    public void printOddNums() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // Write a method that creates and eventually returns a sum variable that adds up all the numbers from 1 to 255. In this method you are not printing the sum, except to debug if you need to, the method should return the sum. Note: You do not need an array to write this function. 
    public int sigmaSum() {
        int sum = 0;
        for (int i = 1; i <= 255; i++) {
            sum += i;
        }
        return sum;
    }

    // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
    public void iterateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
    public void printMax(int[] arr) {
        
    }
}