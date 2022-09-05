public class Wizard extends Human {
    // Constructor invoking super keyword to pass in default health
    public Wizard() {
        super(3,3,8,50);
    }

    // Class methods
    public void heal(Human human) {
        human.setHealth(human.getHealth() + this.getIntelligence());
    }
    public void fireball(Human human) {
        human.setHealth(human.getHealth() - (this.getIntelligence() * 3));
    }
}