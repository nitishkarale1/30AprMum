package Array;

public class sample11_String_multiDimentional_array
{
	//   0         1     	2		3
	//0 Mahesh   Rahul    Akash   Sanket
	//1 Prasad   Prakash  Ganesh  Atul
	//2 Shubham  Sagar    Ajit    Pratik
	
	public static void main(String[] args) 
	{
	    String [][] B=new String [3][4];
	    
	    B[0][0]="Mahesh"; 
	    B[0][1]="Rahul"; 
	    B[0][2]="Akash";
	    B[0][3]="Sanket";
	    B[1][0]="Prasad";
	    B[1][1]="Nikhil";
	    B[1][2]="Ganesh";
	    B[1][3]="Atul";
	    B[2][0]="Shubham";
	    B[2][1]="Sagar";
	    B[2][2]="Ajit";
	    B[2][3]="Pratik";
	    
	    System.out.println(B[2][1]);
	    
	    System.out.println("--------");
	    
	    for(int i=0; i<=2; i++)
	    {
	    	for(int j=0; j<=3; j++)
	    	{
	    		System.out.print(B[i][j] + "    ");
	    	}
	    	System.out.println();
	    	
	    }
	    
	}

}
