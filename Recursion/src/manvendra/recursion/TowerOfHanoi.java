package manvendra.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
        int n=3;
		TOH(n,'a','b','c');
	}

	private static void TOH(int n, char a, char b, char c) {

		if(n == 1) {
			System.out.println("Move disc "+n+" from "+a+" to "+c);
			return;
		}
		TOH(n-1,a,c,b);
		System.out.println("Move disc "+n+" from "+a+" to "+c);
		TOH(n-1,b,a,c);
	}

}
