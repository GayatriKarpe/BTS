package typesOfVariables;

public class localAndGlobalStudy
{

	int x=12; //global non static variable //declaration and initialization
	static int y=20; //global static variable
	int w=30;//global non static variable 
	static int v=40; //global static variable 
	
	
	public static void main(String[] args)
	{
		localAndGlobalStudy lgs=new localAndGlobalStudy();
		int z=lgs.x+y;
		System.out.println("addition of x and y is "+z);
		
		int a=lgs.w+lgs.x;
		System.out.println("addition of w and x is "+a);
		
		int b=v*lgs.x;
		System.out.println("multiplication of v and x is "+b);
	}
	

}
