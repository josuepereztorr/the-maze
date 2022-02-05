package edu.wctc.room;

import edu.wctc.player.Player;

public interface Interactable {
    // string to display to the Player after they interact with the Room
    // this an abstract method that its body must be specified on any classes that implement this interface
    String interact(Player player);
}
