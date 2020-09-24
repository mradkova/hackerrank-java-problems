package prepKit.sorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumToys {
	// Complete the maximumToys function below.
	static int maximumToys(int[] prices, int k) {
		int n = prices.length;
		// int[] filteredArr = new int[n];
		ArrayList<Integer> eligibleToys = new ArrayList<>();

		//int j = 0;
		for (int i = 0; i < n; i++) {
			if (prices[i] <= k)
				// filteredArr[j++] = prices[i];
				eligibleToys.add(prices[i]);
		}

		// Arrays.sort(filteredArr);
		Collections.sort(eligibleToys);

		int numToys = 0;
		int sum = 0;
		int size = eligibleToys.size();

		for (int i = 0; i < size; i++) {
			int nextPrice = eligibleToys.get(numToys);
			sum += nextPrice;
			numToys++;
			
			if(sum > k) {
				sum -= nextPrice;
				numToys--;
				break;
			}			
		}
		return numToys;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] prices = new int[n];

		String[] pricesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int pricesItem = Integer.parseInt(pricesItems[i]);
			prices[i] = pricesItem;
		}

		int result = maximumToys(prices, k);
		System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

		scanner.close();
	}
}
