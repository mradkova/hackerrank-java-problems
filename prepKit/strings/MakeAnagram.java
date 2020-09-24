package prepKit.strings;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeAnagram {
	
	static int makeAnagram(String a, String b) {
		
		class CharCount{		
			int aCount;
			int bCount;
			
			CharCount(int a, int b){
				this.aCount = a;
				this.bCount = b;
			}
			
			int getACount() {
				return this.aCount;
			}
			
			int getBCount() {
				return this.bCount;
			}
			
		}
		
		Map<Character, CharCount> hashMap = new HashMap<>();
		char[] aCharArr = a.toCharArray();
		char[] bCharArr = b.toCharArray();
		
		for(char c : aCharArr) {
			//hashMap.computeIfPresent(key, (ch, charCount, (ch,(charCount.aCount+1, charCount.bCount)));
			
		}
		
		return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        
        System.out.println(res);
        scanner.close();
    }
}
