package mathmatics.manvendra;

public class PowerCalculation {

	public static void main(String[] args) {
		int a = 9 , b= 3;
		System.out.println(recurcive(a,b));
		System.out.println(iterative(a,b));
		System.out.println(Math.pow(a, b));
	}

	// recursive method to find power
	private static int recurcive(int i, int j) {
       
		if(j==0)
			return 1;
		if(i==0)
			return 0;
		int temp = recurcive(i,j/2);
		if((j&1) == 0)
			return temp*temp;
		else
			return temp*temp*i;	
	}
	
	// iterative method to find power
	/**
	 * Function Name: iterative
	 * @param a (int)
	 * @param b (int)
	 * Inside Method:
	 *  1. take res =1; to store result
	 *  2. while loop is running until b  > 0
	 *  inside while loop:
	 *    1.take last bit of b 
	 *    2.multiply res with a if last bit is 1
	 *    3.each time increase power of a by a*a
	 * @return res (int)
	 */
	private static int iterative(int a, int b) {
		int res= 1;
		while(b > 0) {
			if(b%2 != 0)
				res = res * a;
			a *= a;
			b= b>>1;
		}
		return res;
	}

	
}
