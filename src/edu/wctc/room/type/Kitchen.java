package edu.wctc.room.type;

import edu.wctc.player.Player;
import edu.wctc.room.Interactable;
import edu.wctc.room.Lootable;
import edu.wctc.room.Room;

public class Kitchen extends Room implements Interactable, Lootable {

    public Kitchen() {
        super("KITCHEN");
    }

    @Override
    public String getDescription() {
        return "You are in a dim KITCHEN\n" +
                "The kitchen is filled with many odors and there is a mess everywhere.";
    }

    @Override
    public String interact(Player player) {
        return "You flip the light switch and the room is filled with bright lights.";
    }

    @Override
    public String loot(Player player) {
        return "You have found a kitchen towel";
    }
}
