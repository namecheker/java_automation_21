package semple;

import java.util.Scanner;

public class practiceclass_If_else_Conditions {

	public static void main(String[] args) {
		int a,b;
		float c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF A");
		a=sc.nextInt();
		
		System.out.println("ENTETR THE VALUE OF B");
		b=sc.nextInt();
		
		System.out.println("ENTER THE VALUE OF C");
		c=sc.nextFloat();
		
//		if(a<b)
//		{
//			System.out.println("B is the biggest balue.");
//		}
		
		
//	    if(a<b)
//	    {
//	    	System.out.println("B is biggest value");
//	    }else
//	    {
//	    	System.out.println("A is biggest value");
//	    }
		
		if(a<b)
		{
			if(a<c) 
				{
					System.out.println("C  is the biggest value");
				}
				else
				{
					System.out.println("B is the biggest value");
				}
				
			}
		else
		{
			if(b<c)
			{
				System.out.println("C is the biggest value");
			}
			else
			{
				System.out.println("B is the biggest value");
			}
		}
	}
}
