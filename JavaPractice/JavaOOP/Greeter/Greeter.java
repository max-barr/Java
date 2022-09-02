public class Greeter {

    private String createGreeting(String toBeGreeted) {
        return "Hello, " + toBeGreeted + "!";
    }
    public String greet(String name) {
        return createGreeting(name);
    }
    public String greet() {
        return createGreeting("World");
    }
    // Static method does not need to be instantiated
    public static void testGreeting(String name) {
        System.out.println("This is a test, " + name);
    }

}