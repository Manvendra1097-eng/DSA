package mathmatics.manvendra;

public class LCM {

	public static void main(String[] args) {
		int[] num = {10,20};
		int gcd = gcd(num[0],num[1]);
		/**
		 * here using formula lcm*hcf = a * b where a and b are two number
		 * whose lcm is lcm and hcf is hcf 
		 */
		int lcm = (num[0]*num[1])/gcd;
		System.out.println(lcm);
	}
	
	/**
	 * this method calculate gcd of a and b
	 * @param a
	 * @param b
	 * @return
	 */
	
	private static int gcd(int a, int b) {       
		if(b == 0)
			return a ;
		else 
			return gcd(b,a%b);
	}

}
