package Method4;

public class sample4 
{
	
	public static void main(String[] args) 
	{
		
		StudentName("Nitish ","karale");
		System.out.println("-------------------");
		
		PlayerInfo("Virat kohli", 12311, 92.92f);
	}
	
	public static void StudentName(String FN, String LN)
	{
		System.out.println( FN + LN);
	
	}
	
   
	public static void PlayerInfo(String Name, int Runs, Float StrikeRate)
	{
		System.out.println("Name: "+Name);
		System.out.println("Runs: "+Runs);
		System.out.println("Strike Rate: "+StrikeRate);
	}

}
