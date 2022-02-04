package edu.wctc;

public class Bedroom extends Room implements Interactable, Lootable {

    public Bedroom() {
        super("BEDROOM");
    }

    @Override
    public String getDescription() {
        return "You are in the BEDROOM\n Looks like someone left in a hurry because there are all sorts of belongings in the floor.";
    }

    @Override
    public String interact(Player player) {
        return null;
    }

    @Override
    public String loot(Player player) {
        return null;
    }

}
