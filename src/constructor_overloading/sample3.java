package constructor_overloading;

public class sample3 
{
    float S;
    float T;
    
    sample3()
    {
    	S=11.5f;
    	T=15.7f;
    }
    
    sample3(float s, float t)
    {
    	S=s;
    	T=t;
    }
    
    public static void main(String[] args) 
    {
		sample3 s1=new sample3();
	    s1.multiplication();
	    s1.addition();
	    
	    System.out.println("--------");
	    
	    sample3 s2=new sample3(10.5f,12.8f);
	    s2.addition();
	    s2.multiplication();
	}
    
    public void multiplication()
    {
    	System.out.println(S*T);
    }
    
    public void addition()
    {
    	System.out.println(S+T);
    }
}
