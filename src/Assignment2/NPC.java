package Assignment2;

class NPC implements Cloneable {
    private String name;
    private String description;
    private double health;

    public NPC(String name, String description, double health) {
        this.name = name;
        this.description = description;
        this.health = health;
    }

    public NPC cloneEntity() {
        return new NPC(this.name, this.description, this.health);
    }

    public String getName() {


        
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}


