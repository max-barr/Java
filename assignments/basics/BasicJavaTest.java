import java.util.ArrayList;

class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava tester = new BasicJava();

        tester.printNums();

        tester.printOddNums();

        System.out.println(tester.addNums());

        int[] theArray = {1,3,5,7,9,13};
        tester.iterateArray(theArray);

        int[] anArray = {-1,-30,4,2,0}; 
        int[] anotherArray = {1,20,4,88,9};
        tester.printMaxValue(anArray);
        tester.printMaxValue(anotherArray);

        tester.createArray();
    }
}