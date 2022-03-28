package mathmatics.manvendra;

import java.util.Arrays;

public class CountAllPrime {

	public static void main(String[] args) {
		
		method1(15);
		boolean[] arr = method2(10);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	// method1 == naive solution
	public static void method1(int num) {
		for(int i=1;i<=num;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
		System.out.println();
	}
	
	// method2
	public static boolean[] method2(int num) {
		boolean isPrime[] = new boolean[num+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i=2;i*i<num;i++) {
			
			for(int j=2*i;j<num;j+=i) {
				isPrime[j] = false;
			}
			
		}
		return isPrime;
	}
	
	
	// method to check number is prime or not.
	public static boolean isPrime(int num) {
		if(num<=1)
			return false;
		if(num==2 || num==3)
			return true;
		if(num%2==0 || num%3==0)
			return false;
		for(int i=5;i*i <= num;i+=6) {
			if(num%i==0 || num%(i+2)==0)
				return false;
		}
		return true;
	}

}
