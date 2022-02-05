package edu.wctc.room;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    // returns a Room object if there is a connected room in the supplied direction
    public Room getAdjoiningRoom(char direction) {
        Room[] rooms = {north,south,east,west,up,down};
        char[] cardinalChar = {'n','s','e','w','u','d'};

        if (isValidDirection(direction)) {
            for (int i = 0; i < cardinalChar.length ; i++) {
                if (cardinalChar[i] == direction) {
                    return rooms[i];
                }
            }
        }

        return null;
    }

    // returns true if there is a connected room in the supplied direction
    public boolean isValidDirection(char direction) {
        Room[] rooms = {north,south,east,west,up,down};
        char[] cardinalChar = {'n','s','e','w','u','d'};

        // finds the index of "direction" from cardinalChar[], then it checks for null in the same index in rooms[]
        for (int i = 0; i < cardinalChar.length ; i++) {
            if (cardinalChar[i] == direction) {
                return !Objects.isNull(rooms[i]);
            }
        }

        return false;
    }

    // returns a String with the available exits
    public String getExits() {
        String[] cardinalStr = {"North","South","East","West","Up","Down"};
        List<String> str = new ArrayList<>();
        char cardinalChar;

        for (String s : cardinalStr) {
            cardinalChar = (s.toLowerCase()).charAt(0);
            if (isValidDirection(cardinalChar)) {
                str.add(s);
            }
        }
        return "The exits are: " + String.join(",", str);
    }

    public String getName() {
        return name;
    }

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
