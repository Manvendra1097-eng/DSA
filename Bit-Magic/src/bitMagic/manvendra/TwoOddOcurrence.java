package bitMagic.manvendra;

public class TwoOddOcurrence {

	public static void main(String[] args) {

		int[] num = {1,1,1,1,2,2,3,3,4,5,5,4,3,5,7,7};
		int xor = 0,res1=0,res2=0;
		for(int n : num) {
			xor = xor^n;
		}
		int setBit = xor & ~(xor-1);
		for(int n: num) {
			if((n&setBit) != 0)
				res1 = res1^n;
			else
				res2 = res2^n;
		}
		System.out.println(res1+" "+res2);
	}

}
