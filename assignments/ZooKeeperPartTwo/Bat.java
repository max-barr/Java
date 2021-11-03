public class Bat extends Mammal {

    // Bat constructor, passing in 300 energyLevel
    public Bat() {
        super(300);
    }

    public int fly() {
        System.out.println("Oh my God the bat took off!");
        setEnergyLevel(-50);
        return getEnergyLevel();
    }

    public int eatHumans() {
        System.out.println("The bat just ate a human being!");
        setEnergyLevel(25);
        return getEnergyLevel();
    }

    public int attackTown() {
        System.out.println("The town is on fire!!!");
        setEnergyLevel(-100);
        return getEnergyLevel();
    }
}