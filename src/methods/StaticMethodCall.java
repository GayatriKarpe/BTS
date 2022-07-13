package methods;

public class StaticMethodCall 
{

	public static void main(String[] args)
	{
	sample();  //calling static method from same class
	StaticStudy.sample2(); //calling method from another class 

	}
      public static void sample() //regular static method
      {
    	  System.out.println("hi i am regular static method");
      }
}

    //this is only for static regular methods