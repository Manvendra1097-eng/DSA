package bitMagic.manvendra;

public class CountSetBit {

	public static void main(String[] args) {
		
		int num = 11;
		int count = 0;
		while(num > 0) {
			num = num & (num-1);
			count++;
		}
     System.out.println(count);
	}

}
