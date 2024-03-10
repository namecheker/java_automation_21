package semple;

import java.util.Scanner;

public class practiceWhileloop {

	public static void main(String[] args) {
		int n,mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER N :");
		n=sc.nextInt();
		do
	{
		mul=mul*n;
		n--;
	}while(n>0);
	System.out.println("mul  :"+mul);
		
		
		
		
	}
	}

