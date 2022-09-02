public class GreeterTest {
    public static void main(String[] args) {
        // Instantiate a greeter object
        Greeter g = new Greeter();

        String greeting = g.greet();
        String greetingWithName = g.greet("Max");
        System.out.println(greetingWithName);
        System.out.println(greeting);

        // if (greeting.equals("Hello World") || greetingWithName.equals("Hello Max")) {
        //     System.out.println("Test successful");
        // } else {
        //     System.out.println("Test failed");
        // }
    }
}