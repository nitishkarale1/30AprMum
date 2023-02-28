package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample49_findDuplicateWordInPara 
{
	public static void main(String[] args) 
	{
		String str="nk pk mk vmk nk vmk vmk mk";
		
		String[] ar = str.split(" ");
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String Org = ar[i];
			if(mp.containsKey(Org))
			{
				mp.put(Org, mp.get(Org)+1);
			}
			else
			{
				mp.put(Org, 1);
			}	
		}
		
		Set<String> allkeys = mp.keySet();
		
		for(String key:allkeys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+": "+mp.get(key));
			}
		}
		
		
	}
}
