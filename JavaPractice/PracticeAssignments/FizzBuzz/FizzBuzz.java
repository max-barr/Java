public class FizzBuzz {
    public String fizzBuzz(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else {
            // Use string method to cast int into a string
            String number = String.valueOf(num);
            return number;
        }
    }
}