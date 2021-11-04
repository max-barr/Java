public class Ninja extends Human {

    // constructor
    public Ninja() {
        super(3,10,3,100);
    }

    public int steal(Human human) {
        System.out.println("Your health has been stolen");
        human.setHealth(human.getHealth() - getStealth());
        return human.getHealth();
    }

    public void runAway(Ninja ninja) {
        setHealth(ninja.getHealth() - 10);
    }
}