package semple;

import java.util.Scanner;

public class whilwloop {
	  public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER N :");
		n=sc.nextInt();
		do
		{
			sum=sum+n;
			n--;
		}while(n>0);
		System.out.println("sum  :"+sum);
	}

}
