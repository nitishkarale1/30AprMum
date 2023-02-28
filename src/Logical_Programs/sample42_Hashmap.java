package Logical_Programs;
import java.util.HashMap;
import java.util.Set;

public class sample42_Hashmap
{
	public static void main(String[] args) 
	{
		HashMap<Character, Integer> mp= new HashMap<Character,Integer>();
		
		mp.put('A', 21);
		mp.put('B', 22);
		mp.put('C', 23);
		mp.put('D', 24);
		mp.put('E', 25);
		
		System.out.println(mp.containsKey('A'));
		System.out.println(mp.get('A'));
		System.out.println(mp.keySet());
		Set<Character> allkeys = mp.keySet();
		System.out.println(allkeys);
		
		for(Character key:allkeys)
		{
			System.out.println(key+":"+mp.get(key));
		}
	}
}
