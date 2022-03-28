package manvendra.recursion;

public class PrintNto1 {

	public static void main(String[] args) {
  
		print(10);
	}

	private static void print(int i) {
  
		if(i==0)
			return;
		System.out.print(i+" ");
		print(i-1);
	}

}
