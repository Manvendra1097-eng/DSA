package manvendra.recursion;

public class Print1toN {

	public static void main(String[] args) {

		print(4);
	}

	private static void print(int i) {
 
		if(i==0)
			return;
		
		print(i-1);
		System.out.print(i+" ");
	}

}
