package me.kbz.nostalgia.commands;

import me.kbz.nostalgia.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;

import java.util.ArrayList;
import java.util.List;

public class Rau extends CommandBase implements ICommand {
    Minecraft mc = Reference.mc;
    @Override
    public String getCommandName() {
        return "nosrau";
    }

    @Override
    public List<String> getCommandAliases() {
        ArrayList<String> aliases = new ArrayList<String>();
        aliases.add("rau");
        return aliases;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/nosrau";
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        mc.thePlayer.sendChatMessage("Please respect all users on the Hypixel Network, thank you.");
    }
}
