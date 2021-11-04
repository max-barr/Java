public class Samurai extends Human {
    public static int howMany = 0;

    // constructor
    public Samurai() {
        super(3,3,3,200);
        howMany++;
    }

    public int deathBlow(Human human) {
        System.out.println("You are dead.");
        human.setHealth(0);
        setHealth(getHealth()/2);
        return getHealth();
    }

    public int meditate() {
        setHealth(getHealth() + getHealth()/2);
        return getHealth();
    }

}