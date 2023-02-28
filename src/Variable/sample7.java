package Variable;

public class sample7 

{
	
    public static void main(String[] args)     //main method declaration
	
	{
		//variable declaration
		String CompanyName;          //data type variable name
		String VehicleName;
		String VehicleColour;
		String VehicleModel;
		int VehiclePurchaseYear;
		float VehicleRun;
		char VehicleClass;
		int VehicleResaleValue;
		
		//variable initialization    (assigning value//variable name= variable value)
		CompanyName = "TATA MOTORS";
		VehicleName= "Nexon";
		VehicleColour="Pure Silver";
		VehicleModel= "XZ+";
		VehiclePurchaseYear =2021;
		VehicleRun= 7585.8f;
		VehicleClass= 'A';
		VehicleResaleValue= 85;
		
		//variable usage     
		
		System.out.println("Copany Name: "+ CompanyName);             //(printing statement)
		System.out.println("Vehicle Name: "+ VehicleName);
		System.out.println("Vehicle Colour: "+ VehicleColour);
		System.out.println("Vehicle model: "+ VehicleModel);
		System.out.println("Vehicle Purchase Year: "+ VehiclePurchaseYear);
		System.out.println("Vehicle Run: "+ VehicleRun+" Km");
		System.out.println("Vehicle Class: "+ VehicleClass +"+");
		System.out.println("Vehicle Resale Value: "+ VehicleResaleValue+ "%");
		
	}

}
