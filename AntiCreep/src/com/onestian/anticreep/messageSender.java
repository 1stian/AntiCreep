package com.onestian.anticreep;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class messageSender {
	
	public static void messagePlayer(String msg, String player) {
		Player ply = anticreep.thisPlugin.getServer().getPlayer(player);
		if (ply == null){
			return;
		}
		ply.sendMessage(ChatColor.AQUA + "[" + ChatColor.GOLD + "AntiCreep" + ChatColor.AQUA + "] " + ChatColor.GREEN + msg);
	}
	
	public static void messageNoPerm(String player) {
		Player ply = anticreep.thisPlugin.getServer().getPlayer(player);
		if (ply == null){
			return;
		}
		ply.sendMessage(ChatColor.AQUA + "[" + ChatColor.GOLD + "AntiCreep" + ChatColor.AQUA + "] " + ChatColor.GREEN + 
				"You don't have access to this command");
	}
}
