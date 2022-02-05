package edu.wctc;

import edu.wctc.maze.Maze;
import edu.wctc.room.type.Kitchen;
import edu.wctc.room.type.Office;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Maze maze = new Maze();
//
//        System.out.println(maze.getCurrentRoomDescription());
//        System.out.println(maze.getCurrentRoomExits());
//
//        char input = scanner.nextLine().charAt(0);
        Office office = new Office();
        Kitchen kitchen = new Kitchen();
        kitchen.setNorth(office);
        System.out.println(kitchen.isValidDirection('n'));;
    }
}
