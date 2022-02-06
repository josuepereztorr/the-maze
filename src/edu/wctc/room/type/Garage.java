package edu.wctc.room.type;

import edu.wctc.player.Player;
import edu.wctc.room.Exit;
import edu.wctc.room.Interactable;
import edu.wctc.room.Room;

public class Garage extends Room implements Interactable, Exit {

    public Garage() {
        super("GARAGE");
    }

    @Override
    public String getDescription() {
        return "You are in a large GARAGE with the only light coming from the open kitchen door.\n" +
                "There is a white Tesla model X in front of the garage door.\n" +
                "Looks like the garage door was slammed shut and the chain attached to the motor to pull it up is broken.";
    }

    @Override
    public String interact(Player player) {
        return "You try open the garage door manually by pulling it up and you immediately see a wave of light coming through\n." +
                "Then as soon as you let go the door falls down straight nearly missing your feet.";
    }

    @Override
    public String exit(Player player) {
        return "You lay a sledge hammer on the floor next to the garage door. The hammer is positioned vertically and with the hammer side down.\n" +
                "You then lift the garage door up; with just enough room so that bottom of the door is higher than the hammer.\n" +
                "Using your foot you move the hammer towards the open garage door and let the door fall on top the hammer.\n" +
                "You immediately get on the floor with your back against the cold concrete and move your way toward the light.\n" +
                "GAME OVER";
    }
}
