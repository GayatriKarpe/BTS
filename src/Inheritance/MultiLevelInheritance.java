package Inheritance;

public class MultiLevelInheritance        //in this their is multiple levels of main classes and subclasses
{   

	public static void main(String[] args) {
    Grandfather gf=new Grandfather();
    gf.experiance(); //calling grandfathers properties using grandfather class object
    System.out.println("***************************************");    
   
    Father F=new Father();
    F.money(); //calling fathers properties using fathers object
    F.experiance(); //calling grandfathers properties using fathers object
    
    System.out.println("***************************************");
    
    son s=new son();
    s.bike();//calling son properties using son object
    s.experiance();//calling grandfather properties using son object
    s.money();//calling fathers properties using son object
	}

}
