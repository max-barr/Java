class HumanTest {
    public static void main(String[] args) {
        Human james = new Human();
        Human bill = new Human();
        Human emily = new Human();

        james.getHealth();
        james.getStrength();

        james.attack(bill);

        emily.attack(bill);

        Wizard will = new Wizard();
        will.getIntelligence();
        will.getHealth();
        will.heal(bill);
        will.fireball(bill);

        Ninja nick = new Ninja();
        nick.getStealth();
        nick.steal(will);
        nick.runAway(nick);
        nick.getHealth();

        Samurai sam = new Samurai();
        sam.deathBlow(nick);
        nick.getHealth();
        sam.meditate();

        Samurai stacy = new Samurai();

        System.out.println(Samurai.howMany);
    }
}