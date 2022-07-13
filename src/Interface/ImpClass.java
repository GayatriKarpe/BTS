package Interface;

public class ImpClass implements MyInterface     //click on ImpClass so automatically methods appear
{

	public static void main(String[] args)
	{
		System.out.println(a);
		ImpClass c=new ImpClass();
		c.m1();
		c.m2();
	}

	@Override
	public void m1() //providing definition to incomplete method from interface
	{ 
		System.out.println("method m1 from interface completed in implementation class");
	}

	@Override
	public void m2() //providing definition to incomplete method from interface
	{
		System.out.println("method m2 from interface completed in implementation class");
	}

}
