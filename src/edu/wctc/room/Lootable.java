package edu.wctc.room;

import edu.wctc.player.Player;

public interface Lootable {
    // string to display to the Player after they loot the Room
    // this an abstract method that its body must be specified on any classes that implement this interface
    String loot(Player player);
}
