package edu.wctc.room.type;

import edu.wctc.room.Room;

public class Hallway extends Room {

    public Hallway() {
        super("HALLWAY");
    }

    @Override
    public String getDescription() {
        return "You are now in a small dim HALLWAY\n" +
                "The hallway has family photos on the walls and several doors around you.";
    }
}
