package bitMagic.manvendra;

public class OneOddOcuurrence {

	public static void main(String[] args) {

		int[] num = {1,1,1,1,2,2,3,4,5,5,4,3,5};
		int res = 0;
		for(int n : num) {
			res = res^n;
		}
		System.out.println(res);
	}
}
