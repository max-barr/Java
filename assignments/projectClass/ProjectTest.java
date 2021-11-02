class ProjectTest {
    public static void main(String[] args) {
        
        Project p = new Project();
        p.setName("Project1");
        System.out.println(p.getName());
        p.setDescription("A description of Project1");
        System.out.println(p.getDescription());
        System.out.println(p.elevatorPitch());

        Project alpha = new Project();
        alpha.setName("Project Alpha");
        alpha.setDescription("The most important project of all");
        System.out.println(alpha.elevatorPitch());

        Project beta = new Project("Project Beta");
        beta.setDescription("You are reading the description of Project Beta");
        System.out.println(beta.elevatorPitch());

        Project delta = new Project("Project Delta", "My pride and joy");
        System.out.println(delta.elevatorPitch());
    }
}