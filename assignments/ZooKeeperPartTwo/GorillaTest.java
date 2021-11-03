class GorillaTest {
    public static void main(String[] args) {
        Gorilla g = new Gorilla();

        // Throw 3 things
        g.throwSomething();
        g.throwSomething();
        g.throwSomething();
        
        // Eat bananas twice
        g.eatBananas();
        g.eatBananas();
        
        // Climb something
        g.climb();

        // display energy level
        g.displayEnergy();
    }
}