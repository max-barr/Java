class BatTest {
    public static void main(String[] args) {
        Bat b = new Bat();

        b.displayEnergy();

        // attack 3 towns
        b.attackTown();
        b.attackTown();
        b.attackTown();

        // eat 2 humans
        b.eatHumans();
        b.eatHumans();

        // fly 2 times
        b.fly();
        b.fly();

        b.displayEnergy();
    }
}