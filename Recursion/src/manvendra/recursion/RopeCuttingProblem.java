package manvendra.recursion;

public class RopeCuttingProblem {

	public static void main(String[] args) {

		int n = 5 , a = 2, b= 5, c = 1;
		
		int result = maxCut(n,a,b,c);
		System.out.println(result);
	}

	private static int maxCut(int n, int a, int b, int c) {
		
		if(n == 0)
			return 0;
		
		if(n < 0)
			return -1;
		
		// maxCut(n-a,a,b,c);
		// maxCut(n-b,a,b,c);
		// maxCut(n-c,a,b,c);
        int tempMax = Math.max(maxCut(n-a,a,b,c),
        		      Math.max(maxCut(n-b,a,b,c),
        		    		  maxCut(n-c,a,b,c)));
        
        if(tempMax == -1)
        	return -1 ;
        else
        	return tempMax+1;
	}

}
