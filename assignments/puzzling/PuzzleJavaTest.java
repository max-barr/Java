import java.util.Random;
import java.util.ArrayList;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        
        // Print random array
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        // Print random letter
        String randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        // Print random 8-character password
        String randomPassword = generator.generatePassword();
        System.out.println(randomPassword);

        // Print array of random 8-character words
        ArrayList<String> randomWords = generator.getNewPasswordSet(5);
        System.out.println(randomWords);
    }
}