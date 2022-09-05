public class Ninja extends Human {
    // Constructor invoking super keyword to set default stealth
    public Ninja() {
        super(3,10,3,100);
    }

    // Class methods
    public void steal(Human human) {
        human.setHealth(human.getHealth() - this.getStealth());
        this.setHealth(this.getHealth() + this.getStealth());
    }
    public void runAway() {
        System.out.println("Running away!");
        setHealth(getHealth() - 10);
    }
}