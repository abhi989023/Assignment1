package day1;

public class Demo_StaticVariables {
	
	// STATIC VERIABLE
	static int a=10;
	// STATIC METHOD
	static void display()
	{
		System.out.println("Static Method");
	}
	static
	// STATIC BLOCK
	{
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
	// MAIN METHOD
		
		System.out.println("Main Mathod");
		System.out.println(a);
		display();
 }
}