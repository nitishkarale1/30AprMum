package Logical_Programs;

public class sample6_Reverse_String
{
	public static void main(String[] args) 
	{
		String org="Nitish";
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println(rev);
		
		
	}
	
}
