public class VehicleTest {
    public static void main(String[] args) {
        // Instantiate vehicle objects
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();
        Vehicle blueJeep = new Vehicle("Blue", 4);

        bike.setNumberOfWheels(2);
        bike.setColor("Blue");
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();

        car.setNumberOfWheels(4);
        car.setColor("Red");
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();

        System.out.printf("My bike has %d wheels and it is %s.%n", bikeWheels, bikeColor);
        System.out.printf("Check out my new car! It's got %d wheels and it's %s!%n", carWheels, carColor);
        System.out.printf("Take a look at my %s Jeep! Don't you love the %d wheels?%n", blueJeep.getColor(), blueJeep.getNumberOfWheels());
    }
}