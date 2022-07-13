package ThisAndSuperKeyword;

public class ThisUse 
{      
	int a=500;   //global variable
    //static int b=30;  
    
	public static void main(String[] args)
	{
	ThisUse tu=new ThisUse();
	tu.Test();
	}
	public void Test()
	{
		int a=100;  //local keyword
		System.out.println("local value of a "+a);
		System.out.println("global value of a "+this.a);
	
	    int add1=1+a;      //a uses local value
	    System.out.println("value of add1 is "+add1);
	    
	    int add2=1+this.a;    //a uses global value 
	    System.out.println("value of add2 is "+add2);
	    
	   //int add3=2+this.b;  //we get output but error show for static global variable b
	   //System.out.println("value of add3 is "+add3);
	}

}
