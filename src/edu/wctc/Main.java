package edu.wctc;

import edu.wctc.maze.Maze;
import edu.wctc.room.type.Kitchen;
import edu.wctc.room.type.Office;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maze maze = new Maze();

        do {

            System.out.println(maze.getCurrentRoomDescription());
            System.out.println(maze.getCurrentRoomExits());
            System.out.print(">> ");
            scanner.next();


        } while (maze.isFinished());
    }

}
