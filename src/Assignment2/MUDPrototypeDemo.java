package Assignment2;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        NPC prototypeNPC = new NPC("Orc Warrior", "Boss", 100);

        NPC clonedNPC1 = prototypeNPC.cloneEntity();
        NPC clonedNPC2 = prototypeNPC.cloneEntity();

        clonedNPC1.setHealth(clonedNPC1.getHealth()-50); // Уменьшаем здоровье одного клона

        System.out.println("Original NPC: " + prototypeNPC);
        System.out.println("Clone 1 (damaged): " + clonedNPC1);
        System.out.println("Clone 2 (normal): " + clonedNPC2);
    }
}

