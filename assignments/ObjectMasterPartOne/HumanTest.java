class HumanTest {
    public static void main(String[] args) {
        Human james = new Human();
        Human bill = new Human();
        Human emily = new Human();

        james.getHealth();
        james.getStrength();

        james.attack(bill);

        emily.attack(bill);

    }
}