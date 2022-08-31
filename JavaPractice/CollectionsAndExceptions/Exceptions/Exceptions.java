import java.util.Arrays;

public class Exceptions {
    public static void main(String[] args) {
        
        // Create new array with length 5
        int[] nums = new int[5];
        try {
            nums[1] = 22;
            // Index is too high for array
            nums[5] = 12;
            
        } catch (Exception e) {
            System.out.println("Something went wrong");
            // Print exception
            System.out.println(e);
        }
        // Still runs this code
        System.out.println(Arrays.toString(nums));
    }
}