package prepKit.strings;

import java.io.IOException;
import java.util.Scanner;

/* You are given a string containing characters A and B only. Your task is to change it 
 * into a string such that there are no matching adjacent characters. To do this, you 
 * are allowed to delete zero or more characters in the string. Your task is to find the 
 * minimum number of required deletions.
 * 
 * For example, given the string s = AABAAB, remove an A at positions 0 and 3 to make 
 * s = ABAB in 2 deletions.
 */

public class AlternatingCharacters {
	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {
		int count = 0;
		int n = s.length();
		char[] charArr = s.toCharArray();

		int j;
		for (int i = 0; i < n - 1; i = j + 1) {
			for (j = i + 1; j < n; j++) {
				if (charArr[i] == charArr[j]) {
					count++;
				} else
					break;
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = alternatingCharacters(s);
			System.out.println(result);
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
		}

		// bufferedWriter.close();

		scanner.close();
	}
}
