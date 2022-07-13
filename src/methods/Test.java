package methods;

public class Test 
{

	public static void main(String[] args)
	{
	Test t=new Test(); //created object of same class 
	t.addition(); //calling non static method from same class
    sub();  //calling static method from same class
	
	Test1 t1=new Test1();
	t1.mul(); //calling non static method from different class i.e.Test1
	Test1.division(); //calling static method from different class i.e.Test1
	}

	public void addition() //non static regular method
	{
		int a=20;
		int b=10;
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	public static void sub() //static regular method
	{
		int a=60;
		int b=20;
		int sub=a-b;
		System.out.println("substrction is "+sub);
		}
}
