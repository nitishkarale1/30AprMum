package Logical_Programs;

public class sample25_Reverse_Number
{
	public static void main(String[] args)
	{
		int org=12345;
		
		int rev=0; // 54321
		          
		for(int i=org; i>0; i=i/10)
		{
			int rem=i % 10;     
			
			rev=rev * 10 + rem ;
		}
		System.out.println(rev);
	}
}
