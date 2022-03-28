package mathmatics.manvendra;

public class TrailingZeroInFactorial {

	public static void main(String[] args) {
		int num = 10 ;
		
		// method 1 
		/**
		 * this method have n complexity and over flow issue for large digit
		 */
		int data = factorial(num);
		System.out.println("data is "+ data);
		int count=0;
		while(data % 10 == 0) {
			data = data/10;
			count++;
		}
		System.out.println("Trailing zero using \"method 1\" is "+count);
		//method 2
		/**
		 * in this now we count number of 2 and 5 in factorial 
		 * Preciously 5 also include 10 , 25 etc as they contain more then 1 5 
		 * Trailing zero = n/5 + n/25 +.....
		 * 
		 * complexity of counttrailingZero is log n
		 * 
		 */
		
	     int countFive = counttrailingZero(10);
	     
	     System.out.println(countFive);

	}
	
	public static int factorial(int num) {
		int factorial = 1;
		for(int i = 2;i<=num;i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static int counttrailingZero(int num) {
		int div = 5;
		int result = 0;
		while( div <= num) {
			result += num / div ;
			div = div * 5;
		}
		
		return result;
	}

}
