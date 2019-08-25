package me.puyodead1.customreboot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomReboot extends JavaPlugin {
	public void onEnable() {
		registerCommands();
	}

	private void registerCommands() {
		getCommand("rebootnow").setExecutor(new RebootNow());
	}

	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("reboot")) {

			Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "***Server is rebooting in 30 seconds!***");
			getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				public void run() {
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "***Server is rebooting in 20 seconds!***");
				}
			}, 200L);

			getServer().getScheduler().scheduleAsyncDelayedTask(this, new Runnable() {
				public void run() {
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "***Server is rebooting in 10 seconds!***");
				}
			}, 400L);

			getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				public void run() {
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "***Server rebooting in 5 seconds!***");
				}
			}, 500L);

			getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				public void run() {
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "***Server rebooting in 4 seconds!***");
				}
			}, 520L);

			getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				public void run() {
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "***Server rebooting in 3 seconds!***");
				}
			}, 540L);

			getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				public void run() {
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "***Server rebooting in 2 seconds!***");
				}
			}, 560L);

			getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				public void run() {
					Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "***Server rebooting in 1 second!***");
					for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
						onlinePlayer.kickPlayer(ChatColor.RED + "Server is rebooting! Please wait a little and re-join!");
					}
				}
			}, 580L);

			getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				public void run() {
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stop");
				}
			}, 600L);
		}

		return false;
	}
}