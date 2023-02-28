package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample41_Hashmap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> mp =new HashMap<Integer,String>();
		
		mp.put(101, "Akash");
		mp.put(102, "Sagar");
		mp.put(103, "Mahesh");
		mp.put(104, "Prasad");
		
		boolean result = mp.containsKey(102);
		System.out.println(result);
		
		System.out.println(mp.containsKey(105));
		
		String value = mp.get(101);
		System.out.println(value);
		
		System.out.println(mp.get(104));
		
		Set<Integer> set = mp.keySet();
		System.out.println(set);
		System.out.println(mp.keySet());
		
		for ( Integer key:set)
		{
			System.out.println(key+":"+mp.get(key));
		}
	}
	
}
