package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample45_findDuplicateCharsInString 
{
	public static void main(String[] args) 
	{
		String s1="wxyzxxy";
		
		HashMap<Character, Integer> mp=new HashMap<Character,Integer>();
		
		for (int i=0; i<=s1.length()-1; i++ )
		{
			char a1 = s1.charAt(i);
			if(mp.containsKey(a1))
			{
				mp.put(a1,mp.get(a1)+1 );
			}
			else
			{
				mp.put(a1, 1);
			}
		}
		
		Set<Character> allkeys = mp.keySet();
		//print occurance of charaters
		for(Character key:allkeys)
		{
			System.out.println(key+": "+mp.get(key));
		}
		
		System.out.println("====");
		
		//find duplicate characters
		for(Character key:allkeys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+": "+mp.get(key));
			}
		}
	}
	
}
