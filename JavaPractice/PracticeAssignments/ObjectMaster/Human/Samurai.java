public class Samurai extends Human {
    // Static variable
    public static int howMany = 0;

    // constructor to increase static variable upon instantiation
    public Samurai() {
        howMany++;
    }

    // class methods
    public void deathBlow(Human human) {
        human.setHealth(0);
        System.out.println("Oh my God they are dead!");
        setHealth(getHealth() / 2);
    }

    public void meditate() {
        int halfHealth = getHealth() / 2;
        setHealth(getHealth() + halfHealth);
    }


}