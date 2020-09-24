import java.util.Scanner;

public class PalindromeCounter {
	
	public static int countPalindromes(String s) {
		//find all substrings
		int count = 0;
		int n = s.length();
		//char[] cArr = s.toCharArray();
		
		//count = n;
		
//        for (int len = 2; len <= n; len++) { 
//            for (int i = 0; i <= n - len; i++) {    	
//                int j = i + len - 1; 
//                for (int k = i; k <= j; k++) { 
//                    if(isPalindrome(s.substring(i,j))){
//                    	count++;
//                    }
//                } 
//            } 
//        }
        
        for(int len = 2; len <= n; len++) {
        	for(int i = 0; i <= n - len; i++) {
        		int j = i + len - 1;
        		if(isPalindrome(s.substring(i,j))){
                	count++;
        		}
        	}
        }
		return count;
	}
	
	static boolean isPalindrome(String s) {
		boolean result = false;
		int n = s.length();
		
		char[] cArr = s.toCharArray();
		
		for(int i = 0, j = n-1; i<=j; i++, j-- ) {
			if(cArr[i] != cArr[j]) {
				result = false;
				break;
			}
			result = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String q = scanner.next();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
             
        System.out.println(isPalindrome(q));
        System.out.println(countPalindromes(q));
        
        scanner.close();
	}
}
