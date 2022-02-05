package edu.wctc.maze;

import edu.wctc.room.*;
import edu.wctc.player.*;

public class Maze {

    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze() {

    }

//    // todo - access the Exitable interface method
//    public String exitCurrentRoom() {
//        if (currentRoom.getClass().isAssignableFrom(Exit.class)) {
//            return "d";
//        } else {
//            return "Did not find the main exit.";
//        }
//    }
//
//    // todo - return the Interactable interface method
//    public String interactWithCurrentRoom() {
//        if (currentRoom.getClass().isAssignableFrom(Interactable.class)) {
//            return currentRoom.getExits();
//        } else {
//            return "Found no interactions to be done in this room.";
//        }
//    }
//
//    // todo - return the Lootable interface method
//    public String lootCurrentRoom() {
//        if (currentRoom.getClass().isAssignableFrom(Lootable.class)) {
//            return currentRoom.getExits();
//        } else {
//            return "Found no useful items to loot.";
//        }
//    }
//
//    // todo - requires directions given
//    public boolean move(char direction) {
//        return false;
//    }
//
//    // Getters
//    public int getPlayerScore() {
//        return player.getScore();
//    }
//
//    public String getPlayerInventory() {
//        return player.getInventory();
//    }
//
//    public String getCurrentRoomDescription() {
//        return currentRoom.getDescription();
//    }
//
//    public String getCurrentRoomExits() {
//        return currentRoom.getExits();
//    }
//
//    public boolean isFinished() {
//        return isFinished;
//    }
}
