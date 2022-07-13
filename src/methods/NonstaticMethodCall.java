package methods;

public class NonstaticMethodCall
{

	public static void main(String[] args)
	{
		//object creation should be done in main method
		//syntax for object creation--Classname objectname=new Classname();
		
		NonstaticMethodCall nsmfsc=new NonstaticMethodCall();
		
		//after creating object-->call non static method
		//syntax-->object name.method name();
            nsmfsc.mymethod();  
            
     //calling non static method from another class
            //create object of that class
            NonStaticStudy nsmfac=new NonStaticStudy();
            nsmfac.NonStaticSample();  //calling non static method from another class
            
		}
	public void mymethod() //non static regular method
	{
		System.out.println("hi ,i am non static method from same class");
	}
	
}
 