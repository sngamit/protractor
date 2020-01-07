package myPackage;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		//String str="trainingrite";
		//String vStr="";
		
		System.out.println("Enter string to reverse:");
		        
		 Scanner read = new Scanner(System.in);
		 String str = read.nextLine();
		
		 int len=str.length();
		 String vStr="";
		
		 for(int i=len-1; i>=0; i--) {
			
			vStr=vStr+ str.charAt(i);
			
			}
		
		System.out.println("value of text is " +vStr);

	}

}
