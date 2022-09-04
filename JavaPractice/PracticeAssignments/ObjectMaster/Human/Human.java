public class Human {
    // class attributes
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;
    
    // Getters and Setters
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStealth() {
        return stealth;
    }
    public void setStealth(int stealth) {
        this.stealth = stealth;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    
    // Constructors
    public Human() {
    }
    public Human(int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    // Class methods
    public void attack(Human human) {
        System.out.println("You are under attack");
        int attackerStrength = this.strength;
        human.setHealth(human.getHealth() - attackerStrength);
    }
    
}