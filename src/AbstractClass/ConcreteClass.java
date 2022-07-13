package AbstractClass;

public class ConcreteClass extends Sample
{

	public static void main(String[] args) 
	{
		ConcreteClass cc=new ConcreteClass(); //we have to create object of concrete class
		cc.test1(); // abstract method from Sample

	}
    public void test1()
    {
    	System.out.println(" this method is completed in abstract class");
    }
    
}
