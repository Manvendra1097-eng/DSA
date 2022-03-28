package bitMagic.manvendra;

public class CheckKthBitSetOrNot {

	public static void main(String[] args) {

		System.out.println(method1(10,2));
		System.out.println(method2(10,2));
		
	}
	
	//method1
	public static boolean method1(int num , int bit) {
		return ((num & (1 << (bit-1))) != 0);
	}
	
	public static boolean method2(int num , int bit) {
		 boolean res = ((num >> (bit-1))&1) == 1;
		 return res;
	}

}
