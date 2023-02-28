package Logical_Programs;

public class sample22_total_num_of_spaces
{
	public static void main(String[] args)
	{
		String string= "a b   c d";
		
		int count=0;
		
		for(int i=0; i<=string.length()-1; i++)
		{
			char str1=string.charAt(i);
			
			if(str1==' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
		
		
	}
}
