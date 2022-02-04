package edu.wctc;

import java.util.List;

public class Player {
    // Fields
    private int score;
    private List<String> inventory;

    // adds an item to inventory
    public void addToInventory(String item) {
        inventory.add(item);
    }

    // adds to the players score
    public void addToScore(int point) {
        score += point;
    }

    // returns the Player's inventory list
    public String getInventory() {
        if (!inventory.isEmpty()) {
            String str = String.join(", ", inventory);
            String inv = "Inventory: " + str;
            return inv;
        } else {
            return "No items in inventory";
        }
    }

    // Getter
    public int getScore() {
        return score;
    }
}
