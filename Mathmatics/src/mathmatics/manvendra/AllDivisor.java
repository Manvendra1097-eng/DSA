package mathmatics.manvendra;

public class AllDivisor {

	public static void main(String[] args) {
        int num = 105;
        int num1= num;
        int num2 = num;
		method1(num);
		method2(num1);
		method3(num2);
	}

	//Naive solution -- time complexity is n ;
	public static void method1(int num) {
		for(int i=1 ;i <= num/2 ; i++) {
			if(num%i==0)
				System.out.print(i+" ");
		}
		System.out.print(num+" \n");
	}

	// efficient solution -- time complexity is sqrt(n); but not in sorted order
	public static void method2(int num) {
		for(int i=1 ;i*i <= num ; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				if(i != num/i)
					System.out.print(num/i+" ");	
			}	
		}
		System.out.println();
	}

	public static void method3(int num) {
		int i;
		for(i=1 ;i*i < num ; i++) {
			if(num%i==0) {
				System.out.print(i+" ");	
			}	
		}
		for(i-- ;i>=1 ; i--) {
			if(num%i==0) {
				System.out.print(num/i+" ");	
			}
		}
	}
}
