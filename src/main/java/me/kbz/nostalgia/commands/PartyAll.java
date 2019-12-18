package me.kbz.nostalgia.commands;

import me.kbz.nostalgia.commands.handlers.PartyAllHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import java.util.ArrayList;
import java.util.List;

public class PartyAll extends CommandBase {

    public static String playerName = "";

    @Override
    public String getCommandName() {
        return "partyall";
    }

    @Override
    public List<String> getCommandAliases() {
        ArrayList<String> aliases = new ArrayList<String>();
        aliases.add("pall");
        return aliases;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/partyall";
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if(args.length >= 1) {
            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "Please use the correct command format!" + EnumChatFormatting.RESET + " /partyall"));
        }

        if(args.length == 0) {
            new Thread(() -> PartyAllHandler.PartyAll(sender)).start();
        }
    }
}
