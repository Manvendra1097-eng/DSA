package manvendra.recursion;

public class JosephusProblem {

	public static void main(String[] args) {

		int n = 4, k = 3;
		int survive = deathGame(n,k);
		System.out.println(survive);
	}

	private static int deathGame(int n, int k) {

		if(n == 1)
			return 0;
		
	  return	(deathGame(n-1,k) + k )% n;
	}

}
