package javaMethods;

public class StaticMethod {
	
	public static void sum(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
		

	public static void main(String[] args) {
		
		sum(20, 30); //We can call static method by using class name
		
	}

}
