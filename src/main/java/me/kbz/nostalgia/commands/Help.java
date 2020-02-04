package me.kbz.nostalgia.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import java.util.ArrayList;
import java.util.List;

public class Help extends CommandBase {
    @Override
    public String getCommandName() {
        return "nostalgia";
    }

    @Override
    public List<String> getCommandAliases() {
        ArrayList<String> aliases = new ArrayList<String>();
        aliases.add("nos");
        return aliases;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/nostalgia";
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Welcome to Nostalgia! Here is a list of commands!"
                    + "\n"
                    + EnumChatFormatting.AQUA
                    + "---------------------------------------------"

                    + "\n" + EnumChatFormatting.YELLOW
                    + "/nostalgia help "
                    + EnumChatFormatting.RED + "- "
                    + EnumChatFormatting.GRAY
                    + "Runs the help command for Nostalgia."

                    + "\n" + EnumChatFormatting.YELLOW
                    + "/nosemoji [emoji] "
                    + EnumChatFormatting.BLUE + "- "
                    + EnumChatFormatting.GRAY
                    + "Sends one of Nostalgia's custom emojis in chat."

                    + "\n" + EnumChatFormatting.YELLOW
                    + "/nosrau "
                    + EnumChatFormatting.RED + "- "
                    + EnumChatFormatting.GRAY
                    + "Sends the Respect All Users message in chat."

                    + "\n" + EnumChatFormatting.YELLOW
                    + "/rig "
                    + EnumChatFormatting.BLUE + "- "
                    + EnumChatFormatting.GRAY
                    + "Warns a player that you are in a game in PMs."

                    + "\n" + EnumChatFormatting.YELLOW
                    + "/partyall "
                    + EnumChatFormatting.RED + "- "
                    + EnumChatFormatting.GRAY
                    + "Invites the entire lobby to your party."

                    + "\n" + EnumChatFormatting.YELLOW
                    + "/guildall "
                    + EnumChatFormatting.BLUE + "- "
                    + EnumChatFormatting.GRAY
                    + "Invites the entire lobby to your guild."


                    + "\n"
                    + EnumChatFormatting.AQUA
                    + "---------------------------------------------"

            ));
        } else {
            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Incorrect command format. The correct format is: "
                    + EnumChatFormatting.YELLOW + "/nostalgia help"));
        }
    }
}
