package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TylersUtilities;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Changes god mode", usage = "/<command> [player]", aliases = "/egod")
public class Command_god extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length == 0)
        {
            TylersUtilities.setGod(sender_p, !TylersUtilities.inGod(sender_p));
            TFM_Util.playerMsg(sender_p, "God mode set to " + TylersUtilities.inGod(sender_p));
        }
        if (args.length == 1 && TFM_AdminList.isSuperAdmin(sender))
        {
            Player player = getPlayer(args[0]);
            if (player == null)
            {
                TFM_Util.playerMsg(sender, TFM_Command.PLAYER_NOT_FOUND);
            }
            else
            {
                TylersUtilities.setGod(player, !TylersUtilities.inGod(player));
                TFM_Util.playerMsg(player, "God mode of " + player.getName() + " set to " + TylersUtilities.inGod(player));
            }
        }
        return true;
    }
}
