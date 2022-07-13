package Inheritance;  //in this 1 main class and 1 sub class

public class SingleLevelInheritance {

	public static void main(String[] args) {
	
		mother m=new mother(); //calling mothers properties using object
				m.nature();   //mothers non static method
				mother.kind(); // mothers static method
 System.out.println("***************************************");
	   chid c=new chid(); //creating object for chid class
			   c.bike(); //properties of chid class
			   c.mobile(); // properties of chid class
			   c.nature(); //calling properties of mother using chid object
			   chid.kind(); // calling static method of mother class(properties)
			   
	}

}
