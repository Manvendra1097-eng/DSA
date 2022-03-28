package mathmatics.manvendra;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		
		int ans = (int)Math.log10(num)+1;
		
		System.out.println(ans);
		
		scan.close();

	}

}
