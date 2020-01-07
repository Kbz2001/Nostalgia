package me.kbz.nostalgia.commands;

import me.kbz.nostalgia.Reference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.util.ArrayList;
import java.util.List;

public class InGame extends CommandBase {

    @Override
    public String getCommandName() {
        return "rig";
    }

    @Override
    public List<String> getCommandAliases() {
        ArrayList<String> aliases = new ArrayList<String>();
        aliases.add("ringame");
        aliases.add("replyig");
        return aliases;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/nosig";
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        Reference.mc.thePlayer.sendChatMessage("/r Sorry, I'm in game. I'll get back to you when I'm done.");
    }
}
