public class HumanTest {
    public static void main(String[] args) {
        Human bill = new Human();
        Human sandra = new Human();

        bill.attack(sandra);
        System.out.println(sandra.getHealth());

        Ninja nate = new Ninja();
        Wizard will = new Wizard();
        Samurai steve = new Samurai();
        Samurai sarah = new Samurai();

        System.out.println(Samurai.howMany);

        steve.deathBlow(sandra);
        System.out.println(sandra.getHealth());

        will.heal(sandra);
        System.out.println(sandra.getHealth());

        nate.steal(bill);
        System.out.println(nate.getHealth());
        System.out.println(bill.getHealth());

        will.fireball(bill);
        System.out.println(bill.getHealth());
    }
}