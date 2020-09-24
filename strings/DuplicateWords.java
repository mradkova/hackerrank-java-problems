package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
	public static void main(String[] args) {

        //String regex = "/* Write a RegEx matching repeated words here. */";
		// \\b - Matches the word boundaries when outside the brackets. Matches the 
		//       	backspace (0x08) when inside the brackets.
        String regex = "\\b(w+)s+\1\\b";  //\b(\w+)\s+\1\b
        Pattern p = Pattern.compile(regex, 2); // 2 - case_insensitive

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(regex, "");
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
