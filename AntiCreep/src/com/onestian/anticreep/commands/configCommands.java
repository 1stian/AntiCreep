package com.onestian.anticreep.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.onestian.anticreep.messageSender;
import com.onestian.anticreep.writeConfig;

public class configCommands implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender.hasPermission("anticreep.config") || sender.isOp()) {
			if (!(args.length < 2)) {
				String arg1 = args[0];
				switch (arg1) 
				{
				case "block":
					if (args[1].equalsIgnoreCase("true") || args[1].equalsIgnoreCase("false")) {
						writeConfig.setBlock(args[1]);
						messageSender.messagePlayer("Block damage: " + args[1], sender.getName());
					}else {
						messageSender.messagePlayer("Usage: /acconfig block|player|spawn true|false", sender.getName());
					}
					break;
				case "player":
					if (args[1].equalsIgnoreCase("true") || args[1].equalsIgnoreCase("false")) {
						writeConfig.setPlayer(args[1]);
						messageSender.messagePlayer("Player damage: " + args[1], sender.getName());
					}else {
						messageSender.messagePlayer("Usage: /acconfig block|player|spawn true|false", sender.getName());
					}
					break;
				case "spawn":
					if (args[1].equalsIgnoreCase("true") || args[1].equalsIgnoreCase("false")) {
						writeConfig.setSpawn(args[1]);
						messageSender.messagePlayer("Spawn creeper: " + args[1], sender.getName());
					}else {
						messageSender.messagePlayer("Usage: /acconfig block|player|spawn true|false", sender.getName());
					}
					break;
				}
			}else {
				messageSender.messagePlayer("Usage: /acconfig block|player|spawn true|false", sender.getName());
			}
			
			return true;
		}else {
			messageSender.messageNoPerm(sender.getName());
			
			return true;
		}
	}
}
