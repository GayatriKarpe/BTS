package Interface;

public class Animals implements Dog
{

	public static void main(String[] args) 
	{
		Animals a=new Animals();
		a.parrot(); //method from PetAnimals
		a.birds();//method from PetAnimals
		a.billy();//method from Dog
		a.bruno();//method from Dog
		

	}

	@Override
	public void birds()
	{
		System.out.println("i have a bird name sweety");
	}

	@Override
	public void parrot() 
	{
		System.out.println("i have two pet animals and a parrot");
		
	}

	@Override
	public void bruno()
	{
		System.out.println("i have a dog name bruno");
		
	}

	@Override
	public void billy()
	{
		
		System.out.println("i have a another dog name billy");
	}

}
