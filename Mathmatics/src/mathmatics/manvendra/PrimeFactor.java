package mathmatics.manvendra;

public class PrimeFactor {

	public static void main(String[] args) {
		int num = 315*2*2*2*17*3;
		int num1 = num;
		int num2 = num;
		method1(num);
		method2(num1);
		method3(num2);
	}

	private static void method1(int num) {
		if (num <= 1)
			return;
		for(int i =2;i <= num;i++) {
			if(isPrime(i)) {
				while(num%i == 0) {
					System.out.print(i+" ");
					num = num/i ;
				}
			}
		}
		System.out.println();
	}

	private static void method2(int num) {
		if (num <=1)
			return;
		for(int i =2;i*i < num ;i++) {
			if(isPrime(i)) {
				while(num%i == 0) {
					System.out.print(i+" ");
					num = num/i;
				}
			}
		}
		if(num > 1)
			System.out.print(num+" ");
		System.out.println();
	}

	private static void method3(int num) {
		if(num <= 1)
			return;
		while(num%2==0) {
			System.out.print(2+" ");
			num = num/2;
		}
		while(num%3==0) {
			System.out.print(3+" ");
			num = num/3;
		}

		for(int i =5;i*i < num ;i+=6) {
			while(num%i==0) {
				System.out.print(i+" ");
				num = num/i;
			}
			while(num%(i+2)==0) {
				System.out.print(i+2+" ");
				num = num/(i+2);
			}
		}
		if(num > 3)
			System.out.print(num+" ");
	}

	public static boolean isPrime(int num) {
		if(num == 0 || num == 1)
			return false;
		if(num == 2 || num == 3)
			return true;
		if(num%2 == 0 || num%3 == 0)
			return false;
		for(int i =5 ; i*i < num ; i += 6  ) {
			if(num % i == 0 || num % (i+2) == 0)
				return false;
		}
		return true;
	}
}


