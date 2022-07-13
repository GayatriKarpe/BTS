package Interface;

public class Son implements Father,Mother  //click on son methods appear
{

	public static void main(String[] args)
	{
		Son s=new Son();
		s.money();
		s.love();
		s.nature();
		Father.Test();
		Mother.Test();
	}

	@Override
	public void money() 
	{
		Father.super.money();
		Mother.super.money();
	}

	@Override
	public void love()  //incomplete method from mother
    {
	System.out.println("mothers interface method complete here");
	}

	@Override
	public void nature()//incomplete method from father
	{
		System.out.println("fathers interface method complete here");
	}

}
