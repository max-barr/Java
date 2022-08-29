public class BasicAlgosTest {
    public static void main(String[] args) {
        // Create new BasicAlgos object to test methods
        BasicAlgos tester = new BasicAlgos();

        // tester.printNums();
        // tester.printOddNums();
        // System.out.println(tester.sigmaSum());

        // int[] testArray = {1,2,3,4,5,6};
        // tester.iterateArray(testArray);

        // int[] testArray = {-3,0,4,1,6,7,-5};
        // tester.printMax(testArray);

        // tester.oddArray();

        // int[] testArray = {1,0,23,6,2,-3};
        // tester.arrayAverage(testArray);

        // int[] testArray = {1,3,4,6,7,8,9};
        // System.out.println(tester.greaterThanY(testArray, 4));

        // int[] testArray = {-2,0,4,6,8};
        // tester.squareValues(testArray);
        // tester.iterateArray(testArray);

        int[] testArray = {1,-4,3,-5,9,-9,54,-10};
        tester.eliminateNegatives(testArray);
        tester.iterateArray(testArray);
    }
}