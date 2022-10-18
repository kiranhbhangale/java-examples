package com.classobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public class PatternMatch2 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		ArrayList<String> regexList = new ArrayList<>();

		//String uri = "/cvs-rd/template/client/1/lob/2/Login";
		String uri = "/cvs-rd/template?page=1&size=15&sort-field=lastModifiedAt&type=Custom&sort-order=-1&clientId=2&custom-client=false";

		map.put("/cvs-rd/template/client/*/lob/*/Login", "User login");
		map.put("/logout", "User logout");
		map.put("/cvs-rd/template/client/*/lob/*/Plan", "Plan Change");
		
		map.put("/template?page=.*type=Custom.*custom-client.*", "Show Custom Plan");
		map.put("/template?page=.*type=Master.*custom-client.*", "Show Master Plan");

		regexList.add(".*template/client/.*/lob/.*/Plan");
		regexList.add(".*template/client/.*/lob/.*/Login");

		// Request URL:
		// http://localhost:8081/cvs-rd/template?page=1&size=15&sort-field=lastModifiedAt&type=Custom&sort-order=-1&clientId=2&custom-client=false

//		regexList.add("./template/master/lob/./templateType/Plan");
//		regexList.add(Pattern.quote("./template?page=.&size=.&sort-field=.&type=Custom.*"));
//		regexList.add(Pattern.quote("./template?page=.&size=.&sort-field=.&type=Master.*"));
//		regexList.add("./template.*type=Custom.*custom-client=.");
//		regexList.add("/page=([^&]*)/");
		//regexList.add("(?:\\w+=\\w*|=\\w+)(?:&(?:\\w+=\\w*|=\\w+))*");
		
		//regexList.add(".*template\\?((.*=.*)(&?))+");
		regexList.add(".*template\\?page=.*type=Custom.*custom-client.*");
		regexList.add(".*template\\?page=.*type=Master.*custom-client.*");

		Pattern pattern = null;

		for (String regex : regexList) {
			pattern = Pattern.compile(regex);

			if (Pattern.matches(regex, uri)) {
				if (pattern != null) {
					System.out.println("regex => " + regex);
					for (String key : map.keySet()) {
						if (pattern.matcher(key).matches()) {
							System.out.println(map.get(key));
						}
					}
				}
			}
		}

	}
}
