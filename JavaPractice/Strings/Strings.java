public class Strings {
    public static void main (String[] args) {

        // String myVariableName = "My string's value";

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

        String football = "Are you ready for some football?";

        int a = football.indexOf("you"); 
        // a is 4
        System.out.println(a);

        int b = football.indexOf("so");
        // b is 18
        System.out.println(b);

        int c = football.indexOf("z");
        // c is -1 because it is not found
        System.out.println(c);

        // 5. Trim: The trim() method removes any trailing or leading white spaces from the string.

        String sentence = "   Get rid of the space!      ";
        System.out.println(sentence.trim());

        // 6. Uppercase and Lowercase: The String class provides methods to lowercase and uppercase strings.

        String h = "HELLO";
        String w = "world";
        System.out.println(h.toLowerCase());
        System.out.println(w.toUpperCase());

        // 7. Equality: We can compare the equality of a string in two ways. Do they refer to the exact same object, or do they have the same exact sequence of characters.

        String x = new String("word");
        String y = new String("word");
        // False. They are not the same exact object.
        System.out.println(x == y);
        // True. Same exact characters.
        System.out.println(x.equals(y));

    }
}