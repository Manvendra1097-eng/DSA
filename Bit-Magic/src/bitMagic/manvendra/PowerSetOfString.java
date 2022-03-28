package bitMagic.manvendra;

public class PowerSetOfString {

	public static void main(String[] args) {

		String str = "abc";
		int n = str.length();
		int powerSet = (int) Math.pow(2, n);
		for(int i = 0 ;i < powerSet;i++) {

			for(int j=0;j < 3;j++) {
				if(j == 0)
					System.out.print("\"");
				if((i & (1<<j)) != 0)
					System.out.print(str.charAt(j));
				if(j == 2)
					System.out.print("\"");
			}
			System.out.println();
		}
	}
}
