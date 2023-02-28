package Multilevel_Inheritance;

public class whatsappv3 extends whatsappv2
{
	public void video_calling()
	{
		System.out.println("video_calling");
	}
	
	public static void main(String[] args) 
	{
		whatsappv3 D=new whatsappv3();
		D.SMS();
		D.audio_calling();
		D.video_calling();
	}
}
