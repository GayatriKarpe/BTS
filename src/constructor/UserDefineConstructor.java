package constructor;         //date :15/4/22

public class UserDefineConstructor
{
	int a; //variable declaration for math operation
	int b;  //variable declaration
	
          public UserDefineConstructor()
          {
        	  //user define constructor
        	  //the constructor is called when object is created
        	  System.out.println("hi user define constructor is running");
       //==================================================================
        	 //initialization of data variable
        	  a=10;
        	  b=20;
          }
	public static void main(String[] args) 
	{
		UserDefineConstructor udc=new UserDefineConstructor(); //object  of class created
		udc.add(); //calling add method
		udc.sub(); // calling sub method
		udc.mul();
	}
  //===================================================================================================       
	
	public void add()
	{
	//	a=10;//initialization data variable we now initialize it in constructor
	//	b=20;//initialization data variable
		int sum=a+b;
		System.out.println("addition of no is "+sum);
	}
	
	public void sub()
	{
		int sub=b-a;
		System.out.println("substration of no is "+sub);
	}
	
	public void mul()
	{
	int mul=a*b;
	System.out.println("multiplication of no is "+mul);
	}
}
