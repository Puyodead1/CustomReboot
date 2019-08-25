package me.puyodead1.customreboot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RebootNow implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("rebootnow")) {
			for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
				onlinePlayer.kickPlayer(ChatColor.RED + "Server is rebooting! Please Rejoin!");
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "reload");
			}
		}
		return true;
	}
}
