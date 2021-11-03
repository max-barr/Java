public class Gorilla extends Mammal {

    public int throwSomething() {
        System.out.println("The gorilla threw something!");
        setEnergyLevel(-5);
        return getEnergyLevel();
    }

    public int eatBananas() {
        System.out.println("These bananas are good!");
        setEnergyLevel(10);
        return getEnergyLevel();
    }

    public int climb() {
        System.out.println("The gorilla climbed a tree!");
        setEnergyLevel(-10);
        return getEnergyLevel();
    }
}