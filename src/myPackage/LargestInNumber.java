package myPackage;

import java.util.Scanner;

public class LargestInNumber {

	public static void main(String[] args) {
		
		int a=10,b=20, c=30;
		
	
		System.out.println("Enter first Number: " +a);
		System.out.println("Enter second Number: " +b);
		System.out.println("Enter third Number: " +c);
		
		
		if(a>b && a>c) {
			System.out.println("Number is greater: "+a);
		}
		if(b>a && b>c) {
			System.out.println("Number is greater: "+b);
		}	
		if(c>a && c>b) {
			System.out.println("Number is greater: "+c);
		}
		
		LargestNumber();
		

	}

	
	public static void LargestNumber()
	{
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("Number is greatest " +a);
		}
		else if (b>a && b>c)
		{
			System.out.println("Number is greatest " +b);
		}
		else if (c>a && c>b)
		{
			System.out.println("Number is greatest " +c);
		}
		else
		{
			System.out.println("numbers are not unique");
		}
	}
}
