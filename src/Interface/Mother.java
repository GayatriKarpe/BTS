package Interface;

public interface Mother
{
 void love();
 default void money()
 {
	 System.out.println("mothers money");
 }
 static void Test()
	{
		System.out.println("static test method from mother interface");
	}

}
