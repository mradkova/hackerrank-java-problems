package warmUp;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
    	char[] charArray = s.toCharArray();
    	
    	int[] intArr = new int[n];
    	for(int i = 0; i < n; i++) {
    		if(charArray[i] == 'U')
    			intArr[i] = 1;
    		else
    			intArr[i] = -1;
    	}
    	
    	double countValleys = 0;
    	double countMountains = 0;
    	boolean isValley = false;
    	boolean isMountain = false;
    	int sum = 0;
    	
    	if(intArr[0] == 1) {
    		isMountain = true;
    		isValley = false;
    		countMountains += 0.5;
    	}else {
    		isValley = true;
    		isMountain = false;
    		countValleys += 0.5;
    	}
    	
    	for(int i = 0; i < n; i++) {
    		sum += intArr[i];
    		
    		if(i % 2 != 0) {
    			if(sum == 0) {
    				if(isMountain)
    					countMountains += 0.5;
    				else
    					countValleys += 0.5;
    				
    				if(i < n-1 && intArr[i+1] > 0) {
    					isMountain = true;
    					isValley = false;
    					countMountains += 0.5;
    				}
    				if(i < n-1 && intArr[i+1] < 0) {
    					isValley = true;
    					isMountain = false;
    					countValleys += 0.5;
    				}
    			}
    		}
    	}
    	System.out.println("Count of mountains: " + countMountains);
    	System.out.println("Count of valleys: " + countValleys);
    	return (int) countValleys;
    }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

		scanner.close();
	}
}
