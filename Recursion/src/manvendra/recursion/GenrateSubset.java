package manvendra.recursion;

public class GenrateSubset {

	public static void main(String[] args) {
        String str = "abc";
		subSet(str,"",0);
	}

	private static void subSet(String str, String string, int i) {
		if(i == str.length()) {
			System.out.println(string);
			return;
		}
		subSet(str,string,i+1);
		subSet(str,string+str.charAt(i),i+1);
	}

}
