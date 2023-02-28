package Method4;

public class sample2 

{
	public static void main(String[] args) 
	
	{
		sample2 s2=new sample2();
		System.out.println("Student Info");
		s2.StudentInfo("Rahul patil", 100, 'A', 75.5f);
		System.out.println("----------------------");
		
		System.out.println("Student Info");
		s2.StudentInfo("Priya patil", 92, 'A', 72.4f);
		System.out.println("----------------------");
		
		System.out.println("Player Info");
		PlayerInfo("Virat Kohli", 12311, 92.92f);
		System.out.println("----------------------");
		
		System.out.println("Company Info");
		sample3 s3=new sample3();
		s3.CompanyInfo("ABC", 5, 24.8f);
		System.out.println("----------------------");
	}
	
	//method with String, int, char, float parameter
	public void StudentInfo(String Name,int RollNum, char Grade, float Per)
	{
		System.out.println("Name: "+Name);
		System.out.println("Roll Num: "+RollNum);
		System.out.println("Grade: "+Grade);
		System.out.println("Percentage: "+Per+"%");
	}
	
	//method with String, int, float parameter
	public static void PlayerInfo(String Name, int Runs, float StrikeRate)
	{
		System.out.println("Name: "+Name);
		System.out.println("Runs: "+Runs);
		System.out.println("StrikeRate: "+StrikeRate);
	}

}
