public class Greeter {
    public String greet() {
        return createGreeting("World");
    }
    public String greet(String firstName, String lastName) {
        return createGreeting(firstName + " " + lastName);
    }
    private String createGreeting(String toBeGreeted) {
        return "Greetings " + toBeGreeted;
    }
}