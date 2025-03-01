package Assignment2;

class Room {
    private String description;

    public Room(String description) {
        this.description = description;
    }
    public Room cloneEntity() {
        return new Room(this.description);
    }
}
