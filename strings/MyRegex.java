package strings;

import java.util.Scanner;
import java.util.regex.Pattern;


class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		in.close();
	}
}

class MyRegex {
	private static final String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
	protected static final String pattern = zeroTo255 + "\\." + zeroTo255 + "\\."
											+ zeroTo255 + "\\." + zeroTo255;
	
	private static final Pattern IP_PATTERN = Pattern.compile(pattern); 
	
}
