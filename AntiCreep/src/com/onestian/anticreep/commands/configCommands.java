package com.onestian.anticreep.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

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
						sender.sendMessage("[AntiCreep] Block damage: " + args[1]);
					}else {
						sender.sendMessage("[AntiCreep] Usage: /acconfig block|player|spawn true|false");
					}
					break;
				case "player":
					if (args[1].equalsIgnoreCase("true") || args[1].equalsIgnoreCase("false")) {
						writeConfig.setPlayer(args[1]);
						sender.sendMessage("[AntiCreep] Player damage: " + args[1]);
					}else {
						sender.sendMessage("[AntiCreep] Usage: /acconfig block|player|spawn true|false");
					}
					break;
				case "spawn":
					if (args[1].equalsIgnoreCase("true") || args[1].equalsIgnoreCase("false")) {
						writeConfig.setSpawn(args[1]);
						sender.sendMessage("[AntiCreep] Spawn creeper: " + args[1]);
					}else {
						sender.sendMessage("[AntiCreep] Usage: /acconfig block|player|spawn true|false");
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
