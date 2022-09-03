public class Mammal {
    // Private attributes
    private int energyLevel = 100;

    // Constructors
    public Mammal(){
    }
    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    // Getters
    public int getEnergyLevel() {
        return energyLevel;
    }
    // Setters
    public void setEnergyLevel(int energy) {
        energyLevel = energy;
    }

    // Class methods
    public int displayEnergy() {
        System.out.println(getEnergyLevel());
        return getEnergyLevel();
    }

}