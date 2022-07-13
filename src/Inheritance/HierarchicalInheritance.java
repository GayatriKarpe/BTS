package Inheritance;

public class HierarchicalInheritance  //in this there is 1 main class and multiple subclass
{

	public static void main(String[] args)
	{
        Animal A=new Animal();
        A.pet(); //calling animal properties using animal object
        System.out.println("***************************************");
        
        Dog D=new Dog();
        D.pet();// calling animal properties using dog object
        D.moti(); //calling dog properties using dog object
       
        System.out.println("***************************************");
        
        Cat C=new Cat();
        C.pet();//calling animals properties using cat object
        C.Mani(); //calling cats properties using cat object
       
	}

}
