public class Bat extends Mammal {
    // Constructor invoking super keyword to pass in default energy level
    public Bat() {
        super(300);
    }

    // Class methods
    public void fly() {
        System.out.println("Whoosh");
        setEnergyLevel(getEnergyLevel() - 50);
    }

    public void eatHumans() {
        setEnergyLevel(getEnergyLevel() + 25);
    }
    
    public void attackTown() {
        System.out.println("The town is on fire!");
        setEnergyLevel(getEnergyLevel() - 100);
    }
}