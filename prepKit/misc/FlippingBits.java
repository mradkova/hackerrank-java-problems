package prepKit.misc;

import java.io.IOException;
import java.util.Scanner;

public class FlippingBits {
	// Complete the flippingBits function below.
    static long flippingBits(long n) {
    	
    	String flippedLong = Long.toBinaryString(~n);
    	return Long.parseLong(flippedLong);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            String flippedLong = Long.toBinaryString(~n);
        	System.out.println(Long.parseUnsignedLong(flippedLong, 2));
            
            String binaryString = Long.toBinaryString(n);
            System.out.println("Binary string: " + binaryString);
            
            String flippedString = Long.toBinaryString(~n);
            System.out.println("Flipped string: " + flippedString);
            
            
            //long result = flippingBits(n);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
