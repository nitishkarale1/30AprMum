package Use_of_static_non_static_global_variables;

public class District_Magistrate 
{
	String DM_Name;
	int DM_AIR_Rank;
	static String CM_Name;
	//String DM_CM_Name;
	
	public void DM_info()
	{
		System.out.println(DM_Name+": "+DM_AIR_Rank+": "+CM_Name);
	}

}
