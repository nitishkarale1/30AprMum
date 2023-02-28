package Logical_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class sample50_removeDuplicateCharacters 
{
	public static void main(String[] args) 
	{
		String str="ksvvvkk";
	
		//HashSet<Character> hs=new HashSet<Character>();
		
		LinkedHashSet lhs=new LinkedHashSet();
//		
		for(int i=0; i<=str.length()-1; i++)
		{
			char Ch = str.charAt(i);
			lhs.add(Ch);
		}
		System.out.println(lhs);
	}
	
}
