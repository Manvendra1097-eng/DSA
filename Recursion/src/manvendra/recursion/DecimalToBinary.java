package manvendra.recursion;

public class DecimalToBinary {

	public static void main(String[] args) {

		print(10);
	}

	private static void print(int i) {
        if(i==0)
        	return;
		print(i/2);
		System.out.print(i%2);
	}

}
