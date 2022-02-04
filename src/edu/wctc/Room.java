package edu.wctc;

public abstract class Room {
    // Fields
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    // Constructor- sets the name for the room
    public Room(String name) {
        this.name = name;
    }

    // Abstract method - string to display to the Player when they enter a Room which must contain a description of what they see
    public abstract String getDescription();

    // todo - given a direction if there is another Room  in the given direction, that Room is returned; otherwise return null.
    public Room getAdjoiningRoom(char direction) {
        return null;
    }

    // todo - returns a String of a list of all the directions the Player could exit form this Room to another Room.
    public String getExits() {
        return "d";
    }

    // todo - given a direction, if there is another Room in the given direction, return true, otherwise return false
    public boolean isValidDirection(char direction) {
        return false;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setters
    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }
}
