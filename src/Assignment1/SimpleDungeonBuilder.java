package Assignment1;
import java.util.ArrayList;
import java.util.List;

class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    public Dungeon build() {
        return new Dungeon(name, rooms, npcs);
    }
}

