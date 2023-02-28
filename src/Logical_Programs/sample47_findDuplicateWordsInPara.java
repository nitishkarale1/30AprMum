package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample47_findDuplicateWordsInPara
{
	public static void main(String[] args) 
	{
		String Str="sagar akash prasad sagar akash mahesh sagar rahul akash sagar sagar mahesh rahul";
		
		String[] ar = Str.split(" ");
		
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String S1 = ar[i];
			
			if(mp.containsKey(S1))
			{
				mp.put(S1, mp.get(S1)+1);
			}
			else
			{
				mp.put(S1, 1);
			}
		}
		
		Set<String> allkeys = mp.keySet();
		
		for(String key:allkeys)
		{
			if(mp.get(key)<=1)
			{
				System.out.println(key+": "+mp.get(key));
			}
		}
		
		
		
	}
	
}
