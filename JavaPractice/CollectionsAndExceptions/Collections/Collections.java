import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Collections {
    
    public void greeting() {
        System.out.println("Greeting!");
    }

    public void makeArray() {
        int[] myArray = new int[5];
        int[] nums = {3,4,5,6,7};

        System.out.println(myArray.length);
        // Will only print memory address
        System.out.println(nums);
        // Will print out the full array as a string
        System.out.println(Arrays.toString(nums));
    }

    public void makeArrayList() {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.contains(5));
    }

    public void makeHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Name", "Alice");
        map.put("Eye Color", "Brown");
        map.put("Hair Color", "Black");

        System.out.println(map);

        // Looping through HashMap
        for (String key : map.keySet()) {
            System.out.printf("%s : %s%n", key, map.get(key));
        }
        
    }

}