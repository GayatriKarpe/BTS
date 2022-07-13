package loops;

public class While_loop {

	public static void main(String[] args) {
		// print 1-100 gap of 10
		
		int i=10;
		while(i<=100) //10,20,30.....90,100,110
		{
			System.out.println(i);  //10,....90,100
			i=i+10; ///20....90,100,110
		}
     System.out.println("===================================");
			//in reverse

			int j=100;
			while(j>=10) 
			{
				System.out.println(j);
			     j=j-10;
			} 
	 System.out.println("===================================");		
         //print name 5 times
	 int a=1;
	 while(a<=5)
	 {
		 System.out.println("Gayatri");
		 a++;
	 }
	 System.out.println("===================================");
	 
	 //print 17's table 
	 int v=17;
	 int w=1;
	 while(w<=10)
	 {
		 System.out.println(v*w);
		 w++;
	 }
   System.out.println("===================================");
	 
	 //print 22's table  in reverse
	 int p=17;
	 int q=10;
	 while(q>=1)
	 {
		 System.out.println(p*q);
		 q--;
	 }
	 
	 
	}

}
