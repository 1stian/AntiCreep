package com.onestian.anticreep.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.onestian.anticreep.anticreep;

public class reloadConfigCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender.hasPermission("anticreep.reload") || sender.isOp()) {
			anticreep.thisPlugin.reloadConfig();
			sender.sendMessage("[AntiCreep] - Config has been reloaded.");
			
			return true;
		}else {
			sender.sendMessage("You don't have permission to use this command!");
			
			return true;
		}
	}
}
