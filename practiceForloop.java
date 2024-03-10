package semple;

import java.util.Scanner;

public class practiceForloop {

	public static void main(String[] args) {
		int i,n,mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
           mul=mul*i;
			
		}
		System.out.println("mul  "+mul );
	}
}
