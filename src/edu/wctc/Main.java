package edu.wctc;

import edu.wctc.maze.Maze;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maze maze = new Maze();

        System.out.println(maze.getCurrentRoomDescription());
        System.out.println(maze.getCurrentRoomExits());

        char input = scanner.nextLine().charAt(0);
    }
}
