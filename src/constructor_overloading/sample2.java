package constructor_overloading;

public class sample2 
{
    String P;
    String Q;
    
    
    sample2(String a, String b)
    {
    	P=a;
    	Q=b;
    }
    
    sample2()
    {
    	P= "Hello, I am Nitish and ";
    	Q= " I Love to Travel";
    }
    
    public void NK()
    {
    	System.out.println(P+Q);
    }
    
    public static void main(String[] args) 
    {
		sample2 s1=new sample2();
		s1.NK();
		System.out.println("-----  -----  -----");
		
		sample2 s2=new sample2("I live in Aurangabd and ", "I am passionate about sports bikes");
		s2.NK();
	}
}
