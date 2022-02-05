package edu.wctc.room;

import edu.wctc.player.Player;

public interface Exit {
    // string to display to the Player after they exit the Room
    // this an abstract method that its body must be specified on any classes that implement this interface
    String exit(Player player);
}
