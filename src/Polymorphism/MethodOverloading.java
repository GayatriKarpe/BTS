package Polymorphism;

public class MethodOverloading {

	public static void main(String[] args)
	{
		 MethodOverloading mo=new  MethodOverloading();
		 mo.add();
		 mo.add(30, 40);
		 add(3.5f,45);

	}
	
	public void add()  //with no parameter
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	
	protected void add(int a,int b)  //method with 2 parameter
	{
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	
	public static void add(float s,int r) //can take same no of parameter but datatypes should different
	{
		float sum2=s+r;
		System.out.println("addition is "+sum2);
	}

}
