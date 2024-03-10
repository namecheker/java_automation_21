
package semple;

import java.util.Scanner;

public class practiceSwitchCase {

	public static void main(String[] args) {
		int  a,b,c,d;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A  :");
		a=sc.nextInt();
		System.out.println("ENTER B :");
		b=sc.nextInt();
		System.out.println("ENTER C :");
		c=sc.nextInt();
		System.out.println("1.  addition");
		System.out.println("2.  subtraction");
		System.out.println("3.  multiplication");
		System.out.println("4.  divison");
		System.out.println("Enter Your Choise  :");
		d=sc.nextInt();
		switch(d)
		{
		case 1:
			c=a+b;
			System.out.println("Addition :"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("substraction :"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("multiplication :"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("divison :"+c);
			break;
			default:
				System.out.println("Invalid Choise");
				break;
		}

}
}