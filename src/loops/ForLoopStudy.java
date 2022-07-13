package loops;

public class ForLoopStudy {

	public static void main(String[] args) {
		// i want to print 0-10 and increment by 1
		for(int a=0;a<=10;a++)  //0 starting value,a<=10 means upto 10 ,a++ increment of 1
		{
			System.out.println(a);
		}
		System.out.println("===================================");
		
		//2's table
		for(int a=2;a<=20;a=a+2) 
		{
			System.out.println(a);
		}
		System.out.println("===================================");

		//i want to print 10-0 in decrement by 1
		for(int a=10;a>=0;a--)  //0 starting value,a<=10 means upto 10 ,a++ increment of 1
		{
			System.out.println(a);
		}
		System.out.println("===================================");
		
		
		//5's table in decresing order
		for(int a=50;a>=5;a=a-5) 
		{
			System.out.println(a);
		}
		System.out.println("===================================");

		//print gayatri 5 times
		for(int a=1;a<=5;a++)
		{
			System.out.println("gayatri");
		}
		
        System.out.println("===================================");
		
		//9's table in different way just like 1*9,2*9,3*9  we just add 1-10 n multiply by 9 
		int j=9;
        for(int i=1;i<=10;i++) 
		{
			System.out.println(i*j);
		}
        System.out.println("===================================");
		
      		//12's table in different way just like 1*12,2*12,3*12 in reverse we just decrese 10-1 n multiply by 12 
      		int v=12;
              for(int i=10;i>=1;i--) 
      		{
      			System.out.println(i*v);
      		}
		//in reverse
	}

}
