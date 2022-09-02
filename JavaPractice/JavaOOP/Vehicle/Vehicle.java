public class Vehicle {

    // private attributes
    private int numberOfWheels;
    private String color;

    // Constructor methods to add attributes on instantiation
    public Vehicle(String color, int num) {
        this.color = color;
        this.numberOfWheels = num;
    }
    public Vehicle() {
    }
    public Vehicle(String color) {
        this.color = color;
    }
    public Vehicle(int num) {
        this.numberOfWheels = num;
    }

    // Getters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public String getColor() {
        return color;
    }

    // Setters
    public void setNumberOfWheels(int num) {
        numberOfWheels = num;
    }
    public void setColor(String color) {
        // "This" is needed to show we are talking about instance variable and not param variable
        this.color = color;
    }
}