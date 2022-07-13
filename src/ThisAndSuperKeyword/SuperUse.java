package ThisAndSuperKeyword;

public class SuperUse extends A

{      
	//1
	int p=100;//global variable from super use class

	public static void main(String[] args) 
	{
		//3
		SuperUse su=new SuperUse();
		su.Test();

	}
	//2
    
	public void Test()
	{
		int p=200;  //local variable
        System.out.println("local value of p is "+p);
        System.out.println("global value of p from same class is "+this.p); 
        System.out.println("global value of p from class A is "+super.p);
	}
}
