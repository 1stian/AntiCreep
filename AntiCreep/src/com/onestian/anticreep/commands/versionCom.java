package com.onestian.anticreep.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.onestian.anticreep.pluginDesc;

public class versionCom implements CommandExecutor {
	
	
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {    	
    	sender.sendMessage("[AntiCreep] Version: " + pluginDesc.getVersion());
    	
        return true;
    }

}
