package Array;

public class sample2 
{
	public static void main(String[] args)
	{
		//Array declaration
		String []ar=new String[4];
		
		//Array initialization
		ar[0]="Akash";
		ar[1]="Prakash";
		ar[2]="Mahesh";
		ar[3]="Ganesh";
		
		//Array usage
		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		System.out.println("--print all data of String array");
		
//		for(int i=0; i<=3; i++)
//		{
//			System.out.println(ar[i]);
//		}
//		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
	}
	
}
