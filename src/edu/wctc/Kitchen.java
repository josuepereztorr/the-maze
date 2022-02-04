package edu.wctc;

public class Kitchen extends Room implements Exitable {

    public Kitchen() {
        super("KITCHEN");
    }

    @Override
    public String getDescription() {
        return "You are in a dark KITCHEN\n The kitchen is filled with many odors of food that has been sit out for days.";
    }

    @Override
    public String exit(Player player) {
        return "Because of the broken kitchen door you have found a way out!";
    }

}
