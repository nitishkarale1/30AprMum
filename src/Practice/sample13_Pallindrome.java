package Practice;

public class sample13_Pallindrome 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		
		String s2="";
		
		for(int a=s1.length()-1; a>=0; a-- )
		{
			s2=s2+s1.charAt(a);
		}
		System.out.println(s2);
		
		if(s1.equals(s2))
		{
			System.out.println("given String is pallindrome");
		}
		else 
		{
			System.out.println("given String is not pallindrome");
		}
	}
}
