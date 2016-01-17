package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.ONLY_IN_GAME, blockHostConsole = true)
@CommandParameters(
		description = "Learn how to apply for admin.", 
		usage = "/<command> [on | off]",
		aliases = "ai")
public class Command_admininfo extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
    	sender.sendMessage(ChatColor.GOLD + "So, you want to apply for admin?");
    	sender.sendMessage(ChatColor.RED + "Well head on over to sprucyfreedom.boards.net and register!");
    	sender.sendMessage(ChatColor.RED + "Make sure you meet the requirements, first of all!");
    	sender.sendMessage(ChatColor.AQUA + "Then apply!");
    	sender.sendMessage(ChatColor.GOLD + "Good Luck, " + sender.getName());

    	return true;
}
}
