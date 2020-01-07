package myPackage;

public class While {

	public static void main(String[] args) {
		
		int i=1;
		while (i<=10)
		{
			System.out.println(i);
			i++;
		}
		forloop();
	}

	public static void forloop() {
		
		for (int i=1; i<=10; i++)
		{
			System.out.println("for loop printing " +i);
		}
			
	}
	
}
