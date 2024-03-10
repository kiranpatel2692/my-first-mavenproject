package mavenprojecteg;

public class Calculator {
	public static int add(int a, int b) {
		return a+b;
		
	}
	public static int sub(int a,int b) {
		return a-b;
		
	}
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static int div(int a , int b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Addition Given number is:"+add(47,56));
		System.out.println("Subtraction Given Number is:"+sub(67,42));
		System.out.println("Multiplication Given Number is:"+multiply(7,2));
		System.out.println("Division Given Number is:"+div(66,4));
	}

}
