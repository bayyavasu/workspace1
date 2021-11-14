package treetest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMApTest {
public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
        //to get keys 
		Set<String> s = m.keySet();
		// to get valus
		Collection<Integer> v = m.values();
		// to get key and value
		Set<Entry<String, Integer>> set = m.entrySet();
		for (Entry<String, Integer> e : set) {
			System.out.println();
		}
        System.out.println(m.size());
		int value = m.get("two");// collections doesnt use primitive datatype
		System.out.println(value);// collections uses wrapper classes
//here wrapper will be automatically convert into primitive(autoboxing)
 
 
 
 
}}
