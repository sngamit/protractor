package myPackage;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int n, m, sum=0;
				
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		 m=sc.nextInt();
			
		while(m > 0) 
			{
		        n = m % 10;
		       	System.out.println("Value of n is :"+n);
		    	System.out.println("Value of m is :"+m);
		       	sum = sum + n;
		         System.out.println("Value of sum is :"+sum);
		         m /= 10;
		         System.out.println("Value of m is :"+m);
		                      
		        }
				
				System.out.println("Sum of Number: " + sum);
		
		

	}

}
