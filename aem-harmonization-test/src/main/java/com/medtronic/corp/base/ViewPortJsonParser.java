package com.medtronic.corp.base;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ViewPortJsonParser {

	JSONParser parser = new JSONParser();
	String jsonFile = "/Users/Shared/workspace/cucumberPoc/aemharmonization/src/main/resources/viewPort.json";
	static JSONObject jsonObject;
	Object obj;

	public ViewPortJsonParser() {

		try {
			obj = parser.parse(new FileReader(jsonFile));
			jsonObject = (JSONObject) obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Map<String, Integer> viewPortDimession = new ViewPortJsonParser().getViewPortDimession("desktop");

		Iterator<Map.Entry<String, Integer>> itr = viewPortDimession.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			if (entry.getKey().equalsIgnoreCase("width")) {
				int x = ((Number) entry.getValue()).intValue();
			}

			if (entry.getKey().equalsIgnoreCase("height"))
				System.out.println("height is " + entry.getValue());
		}
	}

	public Map<String, Integer> getViewPortDimession(String viewPortName) {

		@SuppressWarnings("unchecked")
		Map<String, Integer> viewPortDimession = ((Map<String, Integer>) jsonObject.get(viewPortName));
		return viewPortDimession;

	}

}
