package Inheritance;          //to study inheritance in polymorphism
import Polymorphism.MethodOverloading;

public class MethodOverStudy extends  MethodOverloading 
{

	public static void main(String[] args)
	{
		MethodOverStudy mos=new MethodOverStudy();
		mos.add(10, 20); //calling protected method from call MethodOverloading  from package  polymorphism
	    MethodOverloading .add(6.2f, 10);  //calling public static method from call MethodOverloading   from package  polymorphism
	}
	

}
