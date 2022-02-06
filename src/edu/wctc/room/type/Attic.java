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
        return "After feeling something around your face, you pull it and a light bulb turns on illuminating the room.";
    }

    @Override
    public String loot(Player player) {
        return "You feel your foot hitting something heavy as you walk around, you pick it up is a medium sized sledge hammer.";
    }
}
