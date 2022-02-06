package edu.wctc.maze;

import edu.wctc.room.*;
import edu.wctc.player.*;
import edu.wctc.room.type.*;

import java.util.ArrayList;

public class Maze {

    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze() {

        player = new Player();

        Attic attic = new Attic();
        Bedroom bedroom = new Bedroom();
        Garage garage = new Garage();
        Hallway hallway = new Hallway();
        Kitchen kitchen = new Kitchen();
        Office office = new Office();

        currentRoom = bedroom;

        bedroom.setNorth(hallway);
        hallway.setNorth(office);
        hallway.setSouth(bedroom);
        hallway.setEast(kitchen);
        hallway.setUp(attic);
        attic.setDown(hallway);
        office.setSouth(hallway);
        kitchen.setWest(hallway);
        kitchen.setSouth(garage);
        garage.setNorth(kitchen);

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

//    // todo - return the Lootable interface method
//    public String lootCurrentRoom() {
//        ArrayList<String> interfaceList = getInterfacesFromRoom(currentRoom);
//        //String[] interfaceArr = {"Lootable", "Interactable", "Exit"};
//        String loot = "";
//
//        for (String strList: interfaceList) {
//            if (strList.equals("Lootable")) {
//                loot += "";
//            } else {
//                loot += "Did not find any items to take.";
//            }
//        }
//        return loot;
//    }

    public boolean move(char direction) {
        if (currentRoom.isValidDirection(direction)) {
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        } else
            return false;
    }

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

    private ArrayList<String> getInterfacesFromRoom(Room currentRoom) {

        Class[] objects = currentRoom.getClass().getInterfaces();
        ArrayList<String> interfaces = new ArrayList<>();

        for (Class c : objects) {
            // removes the "edu.wctc." and trims the string
            String intrface = (c.getName()).replaceAll("edu.wctc.", "").trim();
            interfaces.add(intrface);
        }
        return interfaces;
    }
}
