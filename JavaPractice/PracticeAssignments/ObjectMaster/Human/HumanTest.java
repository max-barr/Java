public class HumanTest {
    public static void main(String[] args) {
        Human bill = new Human();
        Human sandra = new Human();

        bill.attack(sandra);
        System.out.println(sandra.getHealth());
    }
}