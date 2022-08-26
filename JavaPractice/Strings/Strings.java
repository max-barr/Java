public class Strings {
    public static void main (String[] args) {

        String myVariableName = "My string's value";

        // -------- METHODS ---------

        // 1. Length
        String coding = "Coding is awesome!";
        int length = coding.length();
        System.out.println("String length is: " + length);

        // 2. Concatenate: : A String method that allows two strings to be squashed together. Since each string is immutable, this results in a brand-new string.

        String string1 = "My name is ";
        String string2 = "Max";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        // 3. Format: Another way to concatenate strings.

        String payback = String.format("Hi %s, you owe me %d dollars!%n", "Jack", 25);
        System.out.println(payback);

        // 4. IndexOf: The indexOf method searches left-to-right inside the given string for a "target" string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.

        
    }
}