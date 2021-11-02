class Project {
    private String name;
    private String description;
    
    // name setter
    public void setName(String name) {
        this.name = name;
    }
    // name getter
    public String getName() {
        return name;
    }
    // description setter
    public void setDescription(String description) {
        this.description = description;
    }
    // description getter
    public String getDescription() {
        return description;
    }

    // Instance method returns name, description
    public String elevatorPitch() {
        return getName() + ": " + getDescription();
    }

    // Overload contructor method in 3 ways
    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }
    
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
}