package Interface;
//multiple inheritance using interface

public interface Father 
{ 
	void nature();
	default void money()   //using same method name for interface mother
	{
		System.out.println("Fathers money");
	}
	 
	static void Test()
	{
		System.out.println("static test method from father interface");
	}

}
