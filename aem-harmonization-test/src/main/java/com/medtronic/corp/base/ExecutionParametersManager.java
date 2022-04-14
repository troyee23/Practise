package com.medtronic.corp.base;

public class ExecutionParametersManager {

	public static String viewPort = "";
	public static String environment = "";

	static {
		viewPort = System.getProperty("viewPort");
		environment = System.getProperty("environment");

		viewPort = isNullOrEmpty(viewPort) ? "desktop" : System.getProperty("viewPort");
		environment = isNullOrEmpty(environment) ? "dev" : System.getProperty("environment");
	}

	private static boolean isNullOrEmpty(String str) {
		if (str != null && !str.isEmpty())
			return false;
		return true;
	}

}
