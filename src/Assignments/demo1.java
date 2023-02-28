package Assignments;

public class demo1 
{
	public static void main(String[] args) 
	{
		String A="VWXYZ";
		String B="";     //ZYXWV
		                 //     0>=0
		for(int s=A.length()-1; s>=0; s--)
		{
			B=B+A.charAt(s);           
		    //B=ZYXW+V	=ZYXWV					
		}
		
		System.out.println(B);
		
	}
}

//Z





//ZZYZYXZYXWZYXWV


//Z
//ZY
//ZYX
//ZYXW
//ZYXWV