package LogicalPrograms;

public class ArmStrongNumber {

	public static void main(String[] args)
	{
		
		// 123-->1^3+2^3+3^3=1+8+27=36
		//153-->1^3+5^3+3^3=1+125+27=153
		 int num=153;
		 int num1=0;
		
		 for(int i=num;i>0;i=i/10) // 153-->153/10--->15/10--->1.5
		{
		    int rem = i%10; //153%10--->3--->15%10-->5-->1%10-->1
		     num1=num1+(rem*rem*rem); //0+27-->125+27--->125+27+1
		}
		
		 if(num==num1)
		{
		   System.out.println("Given number "+num+" is ArmStrongNumber");
		}
		else
		{
		   System.out.println("Given number "+num+" is not an ArmStrongNumber");
		}
	}
}
	


