package edu.wctc;

import edu.wctc.maze.Maze;
import edu.wctc.room.type.Kitchen;
import edu.wctc.room.type.Office;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maze maze = new Maze();

        do {
            System.out.println();
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println("The exits are: " + maze.getCurrentRoomExits());
            System.out.print(">> ");

            List<String> exits = Arrays.asList((maze.getCurrentRoomExits()).split(",", -1));
            List<Character> cardinalChar = new ArrayList<>();

            for (String exit : exits) {
                cardinalChar.add((exit.toLowerCase().charAt(0)));
            }

            char input = (scanner.next()).toLowerCase().charAt(0);

            switch (input) {
                case 'i':
                    System.out.println(maze.interactWithCurrentRoom());
                    break;
                case 'l':
                    System.out.println(maze.lootCurrentRoom());
                    break;
                case 'x':
                    System.out.println(maze.exitCurrentRoom());
                    break;
                case 'v':
                    System.out.println(maze.getPlayerInventory());
                    break;
                case 'n','s','e','w','u','d':
                    if (!cardinalChar.contains(input)) {
                        System.out.println("There is no way to go through there.");
                    } else maze.move(input);
                    break;
            }

        } while (!maze.isFinished());

        System.out.println("Score: " + maze.getPlayerScore());
    }
}
