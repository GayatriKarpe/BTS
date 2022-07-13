package Generalization;

public class Axis implements RBI
{

	@Override
	public void deposite() {
		
		System.out.println("Axis deposit limit 5 lakh");
	}

	@Override
	public void loan() {
	
		System.out.println("Axis loan rate is 8.0%");	
	}

	@Override
	public void withdraw() {
		
		System.out.println("Axis withdrawal limit is 3 lakh");
	}

}
