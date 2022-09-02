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

}