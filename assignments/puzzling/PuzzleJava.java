import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randMachine = new Random();

    // Return array of 10 random numbers between 1-20
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int random = randMachine.nextInt(21);
            if (random != 0) {
                myArray.add(random);
            }
        }
        return myArray;
    }

    // Get a random letter from the alphabet
    public String getRandomLetter() {
        String[] letterArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int randomIndex = randMachine.nextInt(26);
        return letterArray[randomIndex];
    }

    // Generate password that is random string of 8 characters
    public String generatePassword() {
        String randomLetterString = "";
        for (int i = 0; i < 8; i++) {
            String randomLetter = getRandomLetter();
            randomLetterString = randomLetter + randomLetterString;
        }
        return randomLetterString;
    }

    // Create array of random 8-character words
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> myArray = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            String randomWord = generatePassword();
            myArray.add(randomWord);
        }
        return myArray;
    }
}