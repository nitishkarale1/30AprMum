package Logical_Programs;

public class sample24_Reverse_Num 
{
	public static void main(String[] args) 
	{
		int orgnum=521;
		
		String org= Integer.toString(orgnum);
		
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		int revNum=Integer.parseInt(rev);
		System.out.println(revNum);
		
		//System.out.println(rev);
		
	}
}
