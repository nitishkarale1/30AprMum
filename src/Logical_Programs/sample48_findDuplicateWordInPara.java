package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample48_findDuplicateWordInPara
{
	
	public static void main(String[] args) 
	{
		String str="ab abc abcd ab abc cd abc abcd ab abc abc";
		
		String[] ar = str.split(" ");
		
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String s1 = ar[i];
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
		}
		
		Set<String> allkeys = mp.keySet();
		
		//find duplicate word in para
		for(String key:allkeys)
		{
			if (mp.get(key)>1) 
			{
				System.out.println(key+": "+mp.get(key));
			}
		}
	}
}
