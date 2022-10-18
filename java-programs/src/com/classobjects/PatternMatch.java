package com.classobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		
		String uri = "/cvs-rd/template/client/1/lob/2/Plan";
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("/cvs-rd/template/client/*/lob/*/Plan", "Plan Change");

		String regex = ".*template/client/.*/Plan";
		
		ArrayList<String> regexList = new ArrayList<>();
		regexList.add(".*template/client/.*/Plan");
		regexList.add(".*template/client/.*/spring");

		//boolean matches = Pattern.matches(regex, uri);
		
//		if(Pattern.matches(regex, uri)) {
//			System.out.println(map.get(regex));
//		}
		
		  MapLookup lookup = new MapLookupImpl();

		  System.out.println(lookup.lookup(regex,map));

		//System.out.println("matches = " + matches);
	       Pattern pattern = Pattern.compile(regex);
		  
	       for(String s : map.keySet()) {
	    	   if(pattern.matcher(s).matches()) {
	    		   System.out.println(map.get(s));
	    	   }
	    	   
	       }
		  //System.out.println(pattern.matcher("/cvs-rd/template/client/*/lob/*/Plan").matches());

	}

}
