package mathmatics.manvendra;

public class FactorialRecurcive {

	public static void main(String[] args) {
		int num = 5;
		int factorial = 1;
		for(int i = 2;i<=num;i++) {
			factorial *= i;
		}
		System.out.println("Using Iteration "+factorial);
		
		int recrsFatorial = factorial(num);
		
		System.out.println("Using Recursion "+recrsFatorial);
	}

	private static int factorial(int num) {
		
		if(num == 0 || num == 1)
			return num;
		
		return num * factorial(num-1);
	}

}
