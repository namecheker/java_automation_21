/*
 * if condition
 * 
 * 1.simple if
 * 
 * if(condition)
 * {
 * stamante
 * }
 * 
 * 2.if/else
 * if(condition)
 * {
 * stamante
 * }
 * else{
 * stamante
 * }
 * 
 * 
 * 3.nested if
 * 
 * if(condition){
 * {
 * stamante
 * }
 * else{
 * stamante
 * }
 * }
 * else{
 * stamante
 * }
 * 
 * 
 * 4.ladder if
 * 
 * if(condition)
 * {
 * stamante
 * }
 * else
 * {
 * stamante
 * }
 * else if(condition )
 * {
 * stamante
 * }
 * else
 * {
 * stamate
 * }
 * 
 * 
 * 
 * 
*/
package semple;

import java.util.Scanner;

public class ifcondition {
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc=new Scanner  (System.in);
		System.out.println("ENTER A :");
		
		a=sc.nextInt();
       System.out.println("ENTER B:");
		
		b=sc.nextInt();
		 System.out.println("ENTER C:");
			
			c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
			System.out.println("A is max number");
			}else
			{
				System.out.println("C is max number");
			}
		}
		else
		{
			if(b>c)
			{
			System.out.println("C is max number");
			}else {
				System.out.println("C is max number");
			}
		}
	}
	

}
 