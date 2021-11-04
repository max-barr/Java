class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;

    // Human constructors
    public Human() {
    }
    public Human(int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    // health setter
    public int setHealth(int number) {
        health = number;
        return health;
    }
    // health getter
    public int getHealth() {
        System.out.println("Health: " + health);
        return health;
    }

    // strength getter
    public int getStrength() {
        System.out.println("Strength: " + strength);
        return strength;
    }

    // intelligence getter
    public int getIntelligence() {
        System.out.println("Intelligence: " + intelligence);
        return intelligence;
    }

    // stealth getter
    public int getStealth() {
        System.out.println("Stealth: " + stealth);
        return stealth;
    }

    // Attack human method
    public int attack(Human human) {
        System.out.println("You are under attack");
        human.setHealth(human.getHealth() - strength);
        return human.getHealth();
        }
    }