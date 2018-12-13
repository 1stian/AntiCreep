package com.onestian.anticreep.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.onestian.anticreep.writeConfig;

public class configCommands implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender.hasPermission("anticreep.config") || sender.isOp()) {
			if (!(args.length < 2)) {
				String arg1 = args[1];
				switch (arg1) 
				{
				case "block":
					if (args[2].equalsIgnoreCase("true") || args[2].equalsIgnoreCase("false")) {
						writeConfig.setBlock(args[2]);
						sender.sendMessage("[AntiCreep] Block damage: " + args[2]);
					}
					break;
				case "player":
					if (args[2].equalsIgnoreCase("true") || args[2].equalsIgnoreCase("false")) {
						writeConfig.setPlayer(args[2]);
						sender.sendMessage("[AntiCreep] Player damage: " + args[2]);
					}
					break;
				case "spawn":
					if (args[2].equalsIgnoreCase("true") || args[2].equalsIgnoreCase("false")) {
						writeConfig.setSpawn(args[2]);
						sender.sendMessage("[AntiCreep] Spawn creeper: " + args[2]);
					}
					break;
				}
			}else {
				sender.sendMessage("[AntiCreep] Usage: /acconfig block|player|spawn true|false");
			}
			
			return true;
		}else {
			sender.sendMessage("You don't have permission to use this command!");
			
			return true;
		}
	}
}
