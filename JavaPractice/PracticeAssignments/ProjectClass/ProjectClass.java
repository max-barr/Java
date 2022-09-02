public class ProjectClass {
    // fields
    private String name;
    private String description;

    // instance method
    public String elevatorPitch() {
        return String.format("%s: %s", this.name, this.description);
    }

    // Constructors
    public ProjectClass() {
    }
    public ProjectClass(String name) {
        this.name = name;
    }
    public ProjectClass(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}