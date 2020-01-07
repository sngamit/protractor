package myPackage;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter three number");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if (a>=b && a>=c) {
			System.out.println(" bigger number is "+a);
		}
		if (b>=a && b>=c) {
			System.out.println("bigger number is "+b);
		}
		if (c>=a && c>=b) {
			System.out.println("bigger number is "+c);
			
			
		}
		

	}

}
