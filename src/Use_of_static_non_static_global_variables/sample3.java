package Use_of_static_non_static_global_variables;

public class sample3
{
	public static void main(String[] args) 
	{
		players p1=new players();
		p1.PlayerName="Virat Kohli";
		p1.PlayerJerseyNum=18;
		players.CoachName="Ravi Shastri";
      //p1.CoachName="Ravi Shastri";
		
		players p2=new players();
		p2.PlayerName="Rohit Sharma";
		p2.PlayerJerseyNum=45;
		players.CoachName="Ravi Shastri";
	  //p2.CoachName="Ravi Shastri";
		
		players p3=new players();
		p3.PlayerName="Shikhar Dhawan";
		p3.PlayerJerseyNum=42;
		players.CoachName="Rahul Dravid";
      //p3.CoachName="Rahul Dravid";
		
		p1.PlayersInfo();
		System.out.println("---------------------------------");
		p2.PlayersInfo();
		System.out.println("---------------------------------");
		p3.PlayersInfo();
		System.out.println("---------------------------------");
		
		
	}

}
