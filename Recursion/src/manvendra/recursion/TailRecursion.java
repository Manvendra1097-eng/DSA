package manvendra.recursion;

/*
 * Tail recursion is recursion in which last statement is recursion call
 * no other work need to done after recursive call in function take a below examples
 * these are recursive and tail recursive function for factorial
 */

public class TailRecursion {

	public static void main(String[] args) {
        int num = 10;
		
		long ans1 = fact(num);
		long ans2 = tailfact(num ,1);
		System.out.println(ans1);
		System.out.println(ans2);
	}

	private static long tailfact(int num ,int k) {

		if(num == 0 || num == 1)
			return k;
		return tailfact(num-1,k*num);	
	}

	private static long fact(int num) {
  
		if(num == 0 || num == 1)
			return 1;
		return num * fact(num-1);	
	}

}
