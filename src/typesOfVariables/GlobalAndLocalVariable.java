package typesOfVariables;   //date:19/4/22

public class GlobalAndLocalVariable {
	int a=80; //global non static variable
	static int b=100; //global static variable

	public static void main(String[] args)
	{ 
		GlobalAndLocalVariable gl=new GlobalAndLocalVariable();
		System.out.println("value of a is "+gl.a);         //calling non static global variable from same class
		System.out.println("value of b is "+b);     // calling static global variable  from same class
		gl.addition();          // non static method from same class
          subr();   //static method from same class
   //====================================================================================
    System.out.println("value of static global variable from differnt class "+Test.y);  //calling static global variable from different class		  
  
    Test t1=new Test(); //creating object for non static global variable from different class
    System.out.println("value non static global variable from different class "+t1.x); 
  //this is only for getting values for our information  
  //*******************************************************************
    //for mathematical operation use from here
    int mul=b*gl.a;
    System.out.println("mul of b and a is "+mul);
    
    
	}
	
	
	public void addition()
	{
		int p=10; //here p is local variable
		int sum1=a+p;//take value of a from global variable
		System.out.println("sum of a and p is "+sum1);
	}
	public  static void subr()
	{
		int q=60; //here q is local variable
		int sub=b-q;//take value of b from global variable
		System.out.println("substraction of b and p is "+sub); //we cannot add a as it is non static
	}
  
}
