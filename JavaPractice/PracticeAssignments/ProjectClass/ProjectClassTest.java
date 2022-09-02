public class ProjectClassTest {
    public static void main(String[] args) {

        ProjectClass p = new ProjectClass();
        p.setName("Project Alpha");
        p.setDescription("My very first project");
        System.out.println(p.elevatorPitch());

        ProjectClass beta = new ProjectClass("Project Beta");
        beta.setDescription("This is the description for Project Beta");
        System.out.println(beta.elevatorPitch());

        ProjectClass x = new ProjectClass("Project X", "A super secret project");
        System.out.println(x.elevatorPitch());
    }
}