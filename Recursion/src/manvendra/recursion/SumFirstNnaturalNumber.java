package manvendra.recursion;

public class SumFirstNnaturalNumber {

	public static void main(String[] args) {

		int result = sum(5);
		System.out.println(result);
	}

	private static int sum(int i) {
 
		if(i <= 0)
			return 0;
		
		return i+sum(i-1);
	}

}
