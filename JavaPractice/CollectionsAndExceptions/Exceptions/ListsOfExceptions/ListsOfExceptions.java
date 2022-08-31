import java.util.ArrayList;

public class ListsOfExceptions {
    public static void main(String[] args) {
        
        // Create an array list
        ArrayList<Object> myList = new ArrayList<>();

        myList.add("13");
        myList.add("Hello Java");
        myList.add(48);
        myList.add("Goodbye Java");

        // Loop through the list and try to assign each item to an int variable
        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            } catch (Exception e) {
                System.out.println("Something went wrong");
                System.out.println("Error occurred at index: " + i);
                System.out.println("Object value: " + myList.get(i));
            }
            System.out.println("Looping continues...");
        }
    }
}