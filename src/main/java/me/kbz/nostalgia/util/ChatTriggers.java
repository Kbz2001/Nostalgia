package me.kbz.nostalgia.util;

import java.util.ArrayList;
import java.util.List;

public class ChatTriggers {

    private List<String> triggers;

    public static List getTriggers() {

        ArrayList<String> Triggers = new ArrayList<>();

        Triggers.add("1st Killer - ");
        Triggers.add("1st Place - ");
        Triggers.add("Winner: ");
        Triggers.add(" - Damage Dealt - ");
        Triggers.add("Winning Team -");
        Triggers.add("1st - ");
        Triggers.add("Winners: ");
        Triggers.add("Winning Team: ");
        Triggers.add(" won the game!");
        Triggers.add("Top Seeker: ");
        Triggers.add("1st Place: ");
        Triggers.add("Last team standing!");
        Triggers.add("Winner #1 (");
        Triggers.add("Top Survivors");
        Triggers.add("Winners - ");

        return Triggers;

    }

    public void setTriggers(final ArrayList triggers) {

        ArrayList<String> Triggers = new ArrayList<String>();

        Triggers.add("1st Killer - ");
        Triggers.add("1st Place - ");
        Triggers.add("Winner: ");
        Triggers.add(" - Damage Dealt - ");
        Triggers.add("Winning Team -");
        Triggers.add("2nd - ");
        Triggers.add("Winners: ");
        Triggers.add("Winning Team: ");
        Triggers.add(" won the game!");
        Triggers.add("Top Seeker: ");
        Triggers.add("1st Place: ");
        Triggers.add("Last team standing!");
        Triggers.add("Winner #1 (");
        Triggers.add("Top Survivors");
        Triggers.add("Winners - ");
        Triggers.add("VICTORY");
        Triggers.add("DEFEAT");

    }
}
