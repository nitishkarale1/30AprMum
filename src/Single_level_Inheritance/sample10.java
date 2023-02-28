package Single_level_Inheritance;

public class sample10 extends sample9
{
	String E;
	String F;
	
	sample10()
	{
		E="Hockey";
		F="Badminton";
	}
	
	public void U()
	{
		System.out.println(E+" is more popular than "+F);
	}
	
	public static void main(String[] args) 
	{
		sample10 p=new sample10();
		p.S();
		p.T();
		p.U();
		
	}
	
}
