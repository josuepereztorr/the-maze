package edu.wctc.maze;

import edu.wctc.room.*;
import edu.wctc.player.*;
import edu.wctc.room.type.*;

import java.util.ArrayList;
import java.util.List;

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

    public String exitCurrentRoom() {
        List<String> list = getInterfacesFromRoom(currentRoom);
        String message = "";

        if (list.contains("Exit")) {
            message = ((Garage) currentRoom).exit(player);
            isFinished = true;
        } else {
            message = "There is no way out of this house through this room.";
        }

        return message;
    }

    public String interactWithCurrentRoom() {
        List<String> list = getInterfacesFromRoom(currentRoom);
        String message = "Did not find anything to interact with in this room";

        if (list.contains("Interactable")) {
            message = switch (currentRoom.getName()) {
                case "ATTIC" -> ((Attic) currentRoom).interact(player);
                case "BEDROOM" -> ((Bedroom) currentRoom).interact(player);
                case "GARAGE" -> ((Garage) currentRoom).interact(player);
                case "KITCHEN" -> ((Kitchen) currentRoom).interact(player);
                default -> "Did not find anything to interact with in this room";
            };
        }

        return message;
    }

    public String lootCurrentRoom() {
        List<String> list = getInterfacesFromRoom(currentRoom);
        String message = "Did not find anything worth taking in this room";

        if (list.contains("Lootable")) {
            message = switch (currentRoom.getName()) {
                case "ATTIC" -> ((Attic) currentRoom).loot(player);
                case "BEDROOM" -> ((Bedroom) currentRoom).loot(player);
                case "OFFICE" -> ((Office) currentRoom).loot(player);
                case "KITCHEN" -> ((Kitchen) currentRoom).loot(player);
                default -> "Did not find anything worth taking in this room";
            };
        }

        return message;
    }

    public boolean move(char direction) {
        if (currentRoom.isValidDirection(direction)) {
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        }  else {
            return false;
        }
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

    private List<String> getInterfacesFromRoom(Room currentRoom) {
        Class[] classes = currentRoom.getClass().getInterfaces();
        List<String> interfaces = new ArrayList<>();

        for (Class c : classes) {
            interfaces.add(c.getSimpleName());
        }

        return interfaces;
    }
}
