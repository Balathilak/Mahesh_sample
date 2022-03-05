package com.list;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ma {
public static void main(String[] args) {
	Map<Integer,String>map= new LinkedHashMap();
	map.put(10,"Sql");
	map.put(20,"Java");
	map.put(30,"Selenium");
	map.put(40,"FrameWork");
	map.put(50, "TestNg");
	map.put(10, "Cucumber");
	System.out.println(map);
	int size = map.size();
	System.out.println(size);
	map.remove(20);
	System.out.println(map);
	String string = map.get(30);
	System.out.println(string);
	boolean containsKey = map.containsKey(30);
	System.out.println(containsKey);
	boolean containsValue = map.containsValue("Cucumber");
	System.out.println(containsValue);
	Collection<String> values = map.values();
	System.out.println(values);
	Set<Entry<Integer,String>>entry=map.entrySet();
	System.out.println(entry);
	
}
}
