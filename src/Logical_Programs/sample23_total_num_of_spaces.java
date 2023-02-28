package Logical_Programs;

public class sample23_total_num_of_spaces 
{
	public static void main(String[] args) 
	{
		String S1="n  i   t is h" ;
		
		int space_count=0;
		
		for(int i=0; i<=S1.length()-1; i++)
		{
			char S2=S1.charAt(i);
			
			if(S2==' ')
			{
				space_count++ ;
			}
		}
		System.out.println(space_count);
		
	}
}
