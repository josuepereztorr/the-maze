package edu.wctc;

public class Office extends Room implements Lootable {

    public Office() {
        super("OFFICE");
    }

    @Override
    public String getDescription() {
        return "You just entered the OFFICE\n A large work desk sits on the corner of the room with many papers sitting on top of it.";
    }

    @Override
    public String loot(Player player) {
        return null;
    }

}
