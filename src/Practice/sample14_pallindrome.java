package Practice;

public class sample14_pallindrome 
{
	public static void main(String[] args) 
	{
		String a1="ROTATOR";
		
		String a2="";
		
		for(int i=a1.length()-1; i>=0; i--)
		{
			a2=a2+a1.charAt(i);
		}
		
		if(a1.equals(a2))
		{
			System.out.println("given String is pallindrome");
		}
		else
		{
			System.out.println("given String is not pallindrome");
		}
	}
}
