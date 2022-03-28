package mathmatics.manvendra;

import java.util.Scanner;

public class PalindroneNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		int revNum = reverse(num);
		if(revNum == num)
			System.out.println("Yes");
		else
			System.out.println("No");
		scan.close();

	}

	private static int reverse(int num) {
		int revNum = 0;
		while(num > 0){
			revNum = revNum*10 + num%10;
			num = num / 10;
		}
		return revNum;
	}

}
