package edu.wctc;

public class Maze {
    // Fields
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    // Constructor todo - set up concrete Rooms
    public Maze(Player player) {
        this.player = player;
    }

    // todo - access the Exitable interface method
    public String exitCurrentRoom() {
        if (currentRoom.getClass().isAssignableFrom(Exitable.class)) {

            return currentRoom.getExits();
        } else {
            return "Did not find any way to exit this room.";
        }
    }

    // todo - return the Interactable interface method
    public String interactWithCurrentRoom() {
        if (currentRoom.getClass().isAssignableFrom(Interactable.class)) {

            return currentRoom.getExits();
        } else {
            return "Found no interactions to be done in this room.";
        }
    }

    // todo - return the Lootable interface method
    public String lootCurrentRoom() {
        if (currentRoom.getClass().isAssignableFrom(Lootable.class)) {

            return currentRoom.getExits();
        } else {
            return "Found no useful items to loot.";
        }
    }

    // todo - requires directions given
    public boolean move(char direction) {
        return false;
    }

    // Getters
    public int getPlayerScore() {
        return player.getScore();
    }

    public String getPlayerInventory() {
        return player.getInventory();
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }

    public boolean isFinished() {
        return isFinished;
    }
}
