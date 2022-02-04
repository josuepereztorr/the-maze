package edu.wctc;

public class Maze {
    // Fields
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    // Constructor todo - set up concrete Rooms
    public Maze() {

        // create a player object
        Player player = new Player();
        this.player =  player;

        // create 3 rooms
        Bedroom bedroom = new Bedroom();
        Office office = new Office();
        Kitchen kitchen = new Kitchen();

        // set the starting room
        currentRoom = bedroom;

        // join the rooms
        bedroom.setWest(office);
        office.setNorth(kitchen);

        //

    }

    // todo - access the Exitable interface method
    public String exitCurrentRoom() {
        if (currentRoom.getClass().isAssignableFrom(Exitable.class)) {
            return currentRoom.exit(player);
        } else {
            return "Did not find the main exit.";
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
