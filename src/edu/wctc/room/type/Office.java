package edu.wctc.room.type;

import edu.wctc.player.Player;
import edu.wctc.room.Lootable;
import edu.wctc.room.Room;

public class Office extends Room implements Lootable {

    public Office() {
        super("OFFICE");
    }

    @Override
    public String getDescription() {
        return "You just entered an OFFICE with the only light source coming form a flickering computer monitor.\n " +
                "A large work desk sits on the corner of the room with many shifted papers and a broken computer monitor.\n" +
                "As well as several books on the floor from a tipped over bookshelf.";
    }

    @Override
    public String loot(Player player) {
        return "After shifting through the desk drawers you find a iphone with a cracked screen but it is working.";
    }
}
