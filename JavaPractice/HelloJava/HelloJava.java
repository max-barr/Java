public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        // Declaring variables
        int x = 22;
        double dub = 1.25;
        float flo = 13.5f;
        String how = "How are you today?";
        System.out.println(dub);
        System.out.println(x);
        System.out.println(how);
        System.out.println(flo);

        // String method of length
        System.out.println(how.length());

        // String formatting
        String name = "David";
        int age = 29;
        boolean isHungry = true;
        
        String message = "Hi, my name is " + name + " and I am " + age + " years old. I am hungry. This is " + isHungry + ".";
        String message2 = String.format("Hi, my name is %s and I am %d years old.", name, age);
        System.out.println(message);
        System.out.println(message2);

        // Conditionals
        if (isHungry) {
            System.out.println("I am hungry.");
        } else {
            System.out.println("I am full.");
        }

        // Operators: + , - , * , / , % , ++ , += , -= , *= , -- , /=
        // Logical operators: && , || 

        // Calling methods from below
        greeting();
        greeting("Steve");
        greeting("Jimmy", "Python");
        add(2,2);
    }
    
    // Methods
    // Cannot create another method within the main method, but you call it there.
    
    public static void greeting() {
        System.out.println("Hello there! Welcome to Java!");
    }

    public static void greeting(String name) {
        System.out.printf("Welcome to Java, %s!%n", name);
    }

    public static void greeting(String name, String stack) {
        System.out.printf("Hello, %s. Welcome to %s.%n", name, stack);
    }

    // Method returns an integer
    public static int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}
