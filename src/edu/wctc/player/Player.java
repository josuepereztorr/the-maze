package edu.wctc.player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score;
    private List<String> inventory = new ArrayList<>();

    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void addToScore(int point) {
        score += point;
    }

    public String getInventory() {
        if (inventory != null) {
            String str = String.join(", ", inventory);
            return "Inventory: " + str;
        } else {
            return "No items found in inventory";
        }
    }

    public int getScore() {
        return score;
    }
}
