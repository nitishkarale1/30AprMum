package Logical_Programs;
import java.util.HashMap;
import java.util.Set;

public class sample43_Hashmap 
{
	public static void main(String[] args) 
	{
		HashMap<Character, Float> mp=new HashMap<Character,Float>();
		
		mp.put('A', 111.50f);
		mp.put('B', 151.40f);
		mp.put('C', 151.25f);
		
		System.out.println(mp.containsKey('B'));
		
		System.out.println(mp.get('C'));

		Set<Character> allkeys = mp.keySet();
		System.out.println(allkeys);
		
		for (Character key:allkeys)
		{
			System.out.println(key+":"+mp.get(key));
		}
	}
}
