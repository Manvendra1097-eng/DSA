package bitMagic.manvendra;

public class CheckIsPowerOfTwo {

	public static void main(String[] args) {

		int num = 18;
		
		if(num==0)
			System.out.println("yes");
		else if((num &(num-1))==0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
