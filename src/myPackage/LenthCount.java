package myPackage;

public class LenthCount {

	public static void main(String[] args) {
		
		int a=123456;
		
		int reverse=0;
		
		while(a != 0) {
            int digit = a % 10;
            System.out.println("Digit is :"+digit);
            reverse = reverse * 10 + digit;
            System.out.println("Reverse value is :"+reverse);
            a /= 10;
            System.out.println("value od a is :"+a);
                      
        }
		
		System.out.println("Reversed Number: " + reverse);

	}

}
