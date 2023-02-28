package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample44_findDuplicateCharsInString 
{
	public static void main(String[] args) 
	{
		String org="imagination";
		
		HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
		
		for(int i=0; i<=org.length()-1; i++)
		{
			char ch1=org.charAt(i);
			
			if(mp.containsKey(ch1))
			{
				mp.put(ch1, mp.get(ch1)+1);
			}
			else
			{
				mp.put(ch1, 1);
			}
		}
		
		Set<Character>keys=mp.keySet();
		
		for(Character key:keys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key);
			}
		}
		
	}
}
