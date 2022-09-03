public class BatTest {
    public static void main(String[] args) {
        // New bat object
        Bat b = new Bat();

        b.fly();
        b.attackTown();
        b.attackTown();
        b.attackTown();
        b.eatHumans();
        b.eatHumans();
        b.fly();


        System.out.println(b.getEnergyLevel());
    }
}