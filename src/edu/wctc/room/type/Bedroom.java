package edu.wctc.room.type;

import edu.wctc.player.Player;
import edu.wctc.room.Interactable;
import edu.wctc.room.Lootable;
import edu.wctc.room.Room;

public class Bedroom extends Room implements Lootable, Interactable {

    public Bedroom() {
        super("BEDROOM");
    }

    @Override
    public String getDescription() {
        return "You are in a dim and cold room, you notice that this is a BEDROOM\n" +
                "Looks like someone left in a hurry because there are all sorts of belongings in the floor.";
    }

    @Override
    public String interact(Player player) {
        player.addToScore(10);
        return "After flipping the light switch several times; you notice the light bulb is burned out.";
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("Wallet");
        player.addToScore(15);
        player.addToInventory("$20");
        player.addToScore(20);
        player.addToInventory("Tesla Key Card");
        player.addToScore(50);
        player.addToInventory("Bus Pass");
        player.addToScore(20);
        return "You have found a wallet with $20, a bus pass, and a Tesla key card.";
    }

}
