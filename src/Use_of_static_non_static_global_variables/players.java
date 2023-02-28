package Use_of_static_non_static_global_variables;

public class players 
{
	String PlayerName;
	int PlayerJerseyNum;
	static String CoachName;
	
	
	public void PlayersInfo()
	{
		System.out.println(PlayerName+": "+PlayerJerseyNum+": "+CoachName);
	}

}
