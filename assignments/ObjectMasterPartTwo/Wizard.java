public class Wizard extends Human {

    // constructor
    public Wizard() {
        super(3,3,8,50);
    }

    public int heal(Human human) {
        System.out.println("I've healed you");
        human.setHealth(human.getHealth() + getIntelligence());
        return human.getHealth();
    }

    public int fireball(Human human) {
        System.out.println("Fireball!");
        human.setHealth(human.getHealth() - 3 * getIntelligence());
        return human.getHealth();
    }
}