package Accessspecifiers;

public class Velocity {

	public static void main(String[] args)
	{
		//step2
	
		Velocity V=new Velocity();
		V.test1();//calling private method-->visible only within class
		//step4
		V.test2();//calling default method-->visible within package
         //step6
		V.test3();//calling protected method-->visible only within package-->inheritance will provide out of class
		//step8
		V.test4();//calling public method-->visible througout project
	}
	//step 1
	private void test1()
	{
		System.out.println("i am private method from test1");
	}
	//step 3
	void test2()
	{
		System.out.println("i am default method from test2");
	}
	//step5
	protected void test3()
	{
		System.out.println("i am protected method from test3");
	}
	//step7
	public void test4()
	{
		System.out.println("i am public method from test4");
	}

}
