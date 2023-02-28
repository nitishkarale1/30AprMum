package Practice;

public class sample32_Reverse_number
{
	public static void main(String[] args) 
	{
		int A=98765;
		
		int B=0;
		
		for(int i=A; i>0; i=i/10)
		{
			int rem=i % 10;
			
			B=B * 10 + rem;
		}
		System.out.println(B);
	}
}
