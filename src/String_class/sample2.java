package String_class;

public class sample2
{
	public static void main(String[] args) {
		
	
	//Object creation of String Class without new keyword--> Constant Pool Area
	
	String s1="abc";
	String s2="abc";
	String s3="abc1";  
	
	
	//object creation using new keyword--> Non-Constant Pool Area
	String s4=new String("abc");
	String s5=new String("abc");
	String s6=new String("abc1");
	
	System.out.println(s1==s2);		//true
	System.out.println(s1==s3);		//false
	System.out.println(s1==s4);		//false
	System.out.println(s1==s5);		//false
	System.out.println(s3==s6);		//false 
	
	}
}
