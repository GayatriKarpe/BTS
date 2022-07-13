package Generalization;

public class SBI implements RBI
{

	@Override
	public void deposite() {
		
		System.out.println("SBI deposit limit 1 lakh");
	}

	@Override
	public void loan() {
		
		System.out.println("SBI loan rate 9.5%");
	}

	@Override
	public void withdraw() {
		System.out.println("SBI withdrawal limt is 2 lakh");
		
	}

}
