package me.kbz.nostalgia.commands;

import me.kbz.nostalgia.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import java.util.ArrayList;
import java.util.List;

public class Emojis extends CommandBase {
    @Override
    public String getCommandName() {
        return "nosemoji";
    }

    @Override
    public List<String> getCommandAliases() {
        ArrayList<String> aliases = new ArrayList<String>();
        aliases.add("nostalgiaemoji");
        aliases.add("nemoji");
        return aliases;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/nosemoji";
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        Minecraft mc = Reference.mc;
        if (args.length == 0) {
            mc.thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Nostalgia " + EnumChatFormatting.GREEN + "has access to the following emotes in chat:"
                    + "\n"
                    + "<3 - \u2764"
                    + "\n"
                    + "star - \u2605"
                    + "\n"
                    + "yes - \u2714"
                    + "\n"
                    + "no - \u2716"
                    + "\n"
                    + "java - \u2615"
                    + "\n"
                    + "arrow - \u279C"
                    + "\n"
                    + "tableflip - \u0028\u256F\u00B0\u25A1\u00B0\uFF09\u256F\uFE35 \u253B\u2501\u253B"
                    + "\n"
                    + "o/ - ( \uFF9F\u25E1\uFF9F)/"
                    + "\n"
                    + "totem - \u2609_\u2609"
                    + "\n"
                    + "typing - \u270E..."
                    + "\n"
                    + "maths - \u221A(\u03C0+x)=L"
                    + "\n"
                    + "snail - \u0040'-'"
                    + "\n"
                    + "thinking - (0.o?)"
                    + "\n"
                    + "mandem - \u2133\u212B\u2115\u263D\u212F\u2133"
                    + "\n"
                    + "shrug - \u00af\u005c\u005c\u005f\u0028\u30c4\u0029\u005f\u002f\u00af"
                    + "\n"
                    + EnumChatFormatting.RED + "Command Usage: /nosemoji [emoji]"));
        }
        if (args.length == 1) {

            String emoji = args[0].toLowerCase();

            switch (emoji) {

                case "<3":

                    mc.thePlayer.sendChatMessage("\u2764");

                    break;

                case "star":

                    mc.thePlayer.sendChatMessage("\u272C");

                    break;

                case "yes":

                    mc.thePlayer.sendChatMessage("\u2714");

                    break;

                case "no":

                    mc.thePlayer.sendChatMessage("\u2716");

                    break;

                case "java":

                    mc.thePlayer.sendChatMessage("\u2615");

                    break;

                case "arrow":

                    mc.thePlayer.sendChatMessage("\u279C");

                    break;

                case "tableflip":

                    mc.thePlayer.sendChatMessage("\u0028\u256F\u00B0\u25A1\u00B0\uFF09\u256F\uFE35 \u253B\u2501\u253B");

                    break;

                case "o/":

                    mc.thePlayer.sendChatMessage("( \uFF9F\u25E1\uFF9F)/");

                    break;

                case "totem":

                    mc.thePlayer.sendChatMessage("\u2609_\u2609");

                    break;

                case "typing":

                    mc.thePlayer.sendChatMessage("\u270E...");

                    break;

                case "maths":

                    mc.thePlayer.sendChatMessage("\u221A(\u03C0+x)=L");

                    break;

                case "snail":

                    mc.thePlayer.sendChatMessage("\u0040'-'");

                    break;

                case "thinking":

                    mc.thePlayer.sendChatMessage("(0.o?)");

                    break;

                case "mandem":
                    mc.thePlayer.sendChatMessage("\u2133\u212B\u2115\u263D\u212F\u2133");

                    break;

                case "shrug":
                    mc.thePlayer.sendChatMessage("\u00af\u005c\u005c\u005f\u0028\u30c4\u0029\u005f\u002f\u00af");

                    break;

                default:

                    mc.thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Please use a correct emoji!"));

                    break;

            }
        }
    }
}
