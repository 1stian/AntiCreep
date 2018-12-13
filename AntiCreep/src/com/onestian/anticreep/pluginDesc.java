package com.onestian.anticreep;

public class pluginDesc {
	
	public static String getVersion() {
		String version = anticreep.thisPlugin.getDescription().getVersion();
		
		return version;
	}
}
