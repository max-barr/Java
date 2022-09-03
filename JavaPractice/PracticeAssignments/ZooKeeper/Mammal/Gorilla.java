public class Gorilla extends Mammal {
    // Class methods
    public void throwSomething() {
        System.out.println("The gorilla has thrown something");
        setEnergyLevel(getEnergyLevel() - 5);
    }

    public void eatBananas() {
        System.out.println("Yummy bananas");
        setEnergyLevel(getEnergyLevel() + 10);
    }

    public void climb() {
        System.out.println("The gorilla has climbed a tree");
        setEnergyLevel(getEnergyLevel() - 10);
    }

}