package Array;

public class sample3 
{
	public static void main(String[] args)
	{
		//Array declaration
		char []ar=new char [4];
		
		//Array initialization
		ar[0]='A';
		ar[1]='B';
		ar[2]='C';
		ar[3]='D';
		
		//Array usage
		System.out.println(ar[3]);
		System.out.println(ar.length);
		
		System.out.println("--print all data of char array--");
		
//		for(int i=0; i<=3; i++)
//		{
//			System.out.println(ar[i]);
//		}
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
