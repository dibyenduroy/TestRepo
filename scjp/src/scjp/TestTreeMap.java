package scjp;

import java.util.*;
public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap<String,String> map = new TreeMap<String,String>();
		map.put("1", "The Object at 1");
		map.put("2", "The Object at 2");
		map.put("3", "The Object at 3");
		map.put("4", "The Object at 4");
		
		SortedMap<String,String> submap;
		submap = map.subMap("1", "6");
		System.out.println(map + "\n" + submap);
		map.put("b", "bat");
		submap.put("5", "fish");
		//map.put("r", "raccoon");
		System.out.println(map + " " + submap);
		
		


	}

}
