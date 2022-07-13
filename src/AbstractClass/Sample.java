package AbstractClass;

public abstract class Sample {

	public static void main(String[] args) 
	{
		//Sample s=new Sample(); can't create object because class is abstract
		
	}
	
	public void test() //complete method
	{
		System.out.println("hi,i am complete method");
	}
	
	public abstract void test1();//incomplete method--->dont have body

}
