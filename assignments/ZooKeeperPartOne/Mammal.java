class Mammal {
    private int energyLevel = 100;

    // energy level getter
    public int getEnergyLevel() {
        return energyLevel;
    }

    // energy level setter
    public void setEnergyLevel(int number) {
        energyLevel = energyLevel + number;
    }

    // Display energy and return it
    public int displayEnergy() {
        System.out.println("Energy level: " + getEnergyLevel());
        return getEnergyLevel();
    }
}