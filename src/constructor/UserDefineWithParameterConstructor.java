package constructor;

public class UserDefineWithParameterConstructor
{ 
	int a; 
	int b;
	int c;
	
	public UserDefineWithParameterConstructor() // without parameter constructor
      { 
        a=10;
        b=20;
        c=30;
    	  
      }
	public UserDefineWithParameterConstructor(int x)  //user define constr. with one parameter  //when we have to give parameter start with this constructor
	{
		a=x;
	}
	public UserDefineWithParameterConstructor(int x,int y)  //user define constr. with two parameter  //when we have to give parameter start with this constructor
	{
		a=x;
		b=y;
	}
	public UserDefineWithParameterConstructor(int x,int y,int z)  //user define constr. with three parameter  //when we have to give parameter start with this constructor
	{
		a=x;
		b=y;
		c=z;
	}
	
	public static void main(String[] args)
	{
		UserDefineWithParameterConstructor udc=new UserDefineWithParameterConstructor(); //user define without parameter constructor
		udc.addition(); //calling method with zero parameter
		
		UserDefineWithParameterConstructor udc1=new UserDefineWithParameterConstructor(100); //creating object with 1 parameter
		udc1.addition();   //here it take value of a=100, b=0,c=0
		
		UserDefineWithParameterConstructor udc2=new UserDefineWithParameterConstructor(100,200);  //creating object with 2 parameter
         udc2.addition();  //here it take value of a=100,b=200,c=0
          
         UserDefineWithParameterConstructor udc3=new UserDefineWithParameterConstructor(100,200,300);  //creating object with 3 parameter
         udc3.addition();  //here it take value of a=100,b=200,c=300
         
         }
    
	public void addition() //method without parameter
     {
     int sum=a+b+c;
     System.out.println("addition is "+sum);
     }
    
}
