package Practice;


public class sample18_pallindrome 

{
	public static void main(String[] args) 
	{
		String A="asadar";
		
		String B="";
		
		for(int i=A.length()-1; i>=0; i--)
		{
			B=B+A.charAt(i);
		}
		System.out.println("original String: " + (A));
		
		System.out.println("reverse String: " + (B));
		
		if(A.equals(B))
		{
			System.out.println("given String is pallindrome");
		}
		else
		{
			System.out.println("given String is not pallindrome");
		}
	}
	
}
