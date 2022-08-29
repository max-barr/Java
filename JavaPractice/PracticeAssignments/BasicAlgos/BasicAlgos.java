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
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i+1];
            }
        }
        System.out.println(max);
    }

    // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
    public void oddArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                y.add(i);
            }
        }
        System.out.println(y);
    }

    // Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
    public void arrayAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // Typecast sum as a double
        double average = (double)sum / arr.length;
        System.out.println(average);
    }

    // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
    public int greaterThanY(int[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                count++;
            }
        }
        return count;
    }

    // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
    public void squareValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
    }

    // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
    public void eliminateNegatives(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }
}