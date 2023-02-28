package Use_of_static_non_static_global_variables;

public class sample4 
{
	public static void main(String[] args) 
	{
		
		District_Magistrate d1=new District_Magistrate();
		d1.DM_Name="Rakesh Pandey";
		d1.DM_AIR_Rank=112;
		District_Magistrate.CM_Name="Shri Vilasrao Deshmukh";
	  //d1.DM_CM_Name="Shri Vilasrao Deshmukh";
		
		
		District_Magistrate d2=new District_Magistrate();
		d2.DM_Name="Satish Patil";
		d2.DM_AIR_Rank=51;
		District_Magistrate.CM_Name="Shri Pruthviraj Chavan";
	  //d2.DM_CM_Name="Shri Prithviraj Chavan";
		
		
		District_Magistrate d3=new District_Magistrate();
		d3.DM_Name="Gaurav Joshi";
		d3.DM_AIR_Rank=145;
		District_Magistrate.CM_Name="Shri Devendra Fadanvis";
	  //d3.DM_CM_Name="Shri Devendra Fadanvis";
		
		
		d1.DM_info();
		System.out.println("____________________");
		
		d2.DM_info();
		System.out.println("____________________");
		
		d3.DM_info();
		System.out.println("____________________");
		
		
		
	
	}
}
