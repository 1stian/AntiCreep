package com.onestian.anticreep.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.onestian.anticreep.anticreep;
import com.onestian.anticreep.messageSender;

public class reloadConfigCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender.hasPermission("anticreep.reload") || sender.isOp()) {
			anticreep.thisPlugin.reloadConfig();
			messageSender.messagePlayer("Config has been reloaded.", sender.getName());
			
			return true;
		}else {
			messageSender.messageNoPerm(sender.getName());
			
			return true;
		}
	}
}
