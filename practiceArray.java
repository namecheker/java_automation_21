package semple;

import java.util.Scanner;

public class practiceArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+"Elements :");
			a[i]=sc.nextInt();
			
		}
		System.out.println("Array Elements Are");
		for(i=0;i<a.length;i++)
			System.out.println("A["+i+"]="+a[1]);
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[1]>a[2]) 
				{
					
					temp=a[1];
					a[1]=a[2];
					a[2]=temp;
				}
			}
		}
		System.out.println("Array Elements are ascending  order");
		for(i=0;i<a.length;i++)
			System.out.println("A["+i+"]="+a[1]);
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[1]<a[2]) 
				{
					
					temp=a[1];
					a[1]=a[2];
					a[2]=temp;
				}
			}
		}
		System.out.println("Array Elements are discending  order");
		for(i=0;i<a.length;i++)
			System.out.println("A["+i+"]="+a[1]);
			
	}
	
}
