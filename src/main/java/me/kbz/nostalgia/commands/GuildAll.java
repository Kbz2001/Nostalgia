package me.kbz.nostalgia.commands;

import me.kbz.nostalgia.commands.handlers.GuildAllHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import java.util.ArrayList;
import java.util.List;

public class GuildAll extends CommandBase {

    public static String playerName = "";

    @Override
    public String getCommandName() {
        return "guildall";
    }

    @Override
    public List<String> getCommandAliases() {
        ArrayList<String> aliases = new ArrayList<String>();
        aliases.add("gall");
        return aliases;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/guildall";
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if(args.length >= 1) {
            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "Please use the correct command format!" + EnumChatFormatting.RESET + " /guildall"));
        }

        if(args.length == 0) {
            new Thread(() -> GuildAllHandler.GuildAll(sender)).start();
        }
    }
}
