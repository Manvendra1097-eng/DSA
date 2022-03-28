package mathmatics.manvendra;

public class GCD {

	public static void main(String[] args) {
		
		int[] num = {10,20};
		
		System.out.println("Method1 result is "+method1(num[0],num[1]));
		
		System.out.println("Method2 result is "+method2(num[0],num[1]));
		
		System.out.println("Method3 result is "+method3(num[0],num[1]));
		
	}
	
	/**
	 * this is naive method have minimum of i and j 
	 * 
	 */
	private static int method1(int i , int j) {
		int ans = Math.min(i, j);
		while(ans > 0) {
			if(i%ans == 0 && j%ans == 0)
				break;
			ans--;
		}
		
		return ans;
	}
	
    /**
     * Euclidean algorithm - 
     * if b is smaller then a then gcd(a,b) = gcd(a-b,b)
     * 
     * complexity is 
     * 
     */
	private static int method2(int a, int b) {
       
		while(a != b) {
			if(a > b)
				a = a- b;
			else
				b = b - a;
		}
       return a;
	}
	
	/**
	 * This is optimized Euclidean algorithm using divide
	 * @param a
	 * @param b
	 * @return
	 */
	private static int method3(int a, int b) {
	       
		if(b == 0)
			return a ;
		else 
			return method3(b,a%b);
	}
	
	
	
}
