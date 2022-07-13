package constructor;  //its not constructor its method with parameter

public class MobileInfoWithParameterNonStaticMethod   
{ 
	public void  MobileInfoWithParameterNonStaticMethod1(String name, int internalMemory,float Displaysize,int camera,char rating)
	{
		System.out.println("======================================");
		System.out.println("mobile name is "+name);
		System.out.println("mobile internal memory is "+internalMemory);
		System.out.println("mobile display size is "+Displaysize);
		System.out.println("mobile camera is "+camera);
		System.out.println("mobile rating is "+rating);
        System.out.println("======================================");
	}
	

	public static void main(String[] args)
	{
		MobileInfoWithParameterNonStaticMethod miwpnsm=new MobileInfoWithParameterNonStaticMethod();
		miwpnsm.MobileInfoWithParameterNonStaticMethod1("vivo",55,5.5f,20,'A');
		miwpnsm.MobileInfoWithParameterNonStaticMethod1("redmi",25,6.4f,50,'B');

	}

}
