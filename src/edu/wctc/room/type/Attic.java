package edu.wctc.room.type;

import edu.wctc.player.Player;
import edu.wctc.room.Interactable;
import edu.wctc.room.Lootable;
import edu.wctc.room.Room;

public class Attic extends Room implements Lootable, Interactable {

    public Attic() {
        super("ATTIC");
    }

    @Override
    public String getDescription() {
        return "You are in the ATTIC\n" +
                "You find yourself surrounded in darkness and feel something around your head.";
    }

    @Override
    public String interact(Player player) {
        player.addToScore(25);
        return "After feeling something around your face, you pull it down and a light bulb turns on illuminating the entire room.";
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("Sledge Hammer");
        player.addToScore(350);
        return "You feel your foot hitting something heavy as you walk around, you pick it up and find it's a medium sized sledge hammer.";
    }
}
