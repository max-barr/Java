import java.util.ArrayList;
class BasicJava {
    // Print 1-255
    public void printNums() {
        for (int i = 1; i <= 255; i ++) {
            System.out.println(i);
        }
    }

    // Print odd numbers from 1-255
    public void printOddNums() {
        for (int i = 1; i <= 255; i ++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // Add all numbers from 1-255
    public int addNums() {
        int sum = 0;
        for (int i = 1; i <= 255; i++) {
            sum += i;
        }
        return sum;
    }

    // iterate through array
    public void iterateArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    // Find max value
    public void printMaxValue(int[] anArray) {
        int max = anArray[0];
        for (int i = 0; i < anArray.length; i++) {
            if (max < anArray[i]) {
                max = anArray[i];
            }
        }
        System.out.println(max);
    }

    // Create array with odd numbers
    public void createArray() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < 256; i++) {
            if (i % 2 != 0) {
                myArray.add(i);
            }
        }
        System.out.println(myArray);
    }
}