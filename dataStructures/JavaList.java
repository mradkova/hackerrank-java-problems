package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

	//private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		String[] arr = scanner.nextLine().split(" ");
		
		for(int i = 0; i<n; i++) {
			arrList.add(Integer.parseInt(arr[i]));
		}
		
		int nQueries = scanner.nextInt();
		for(int i = 0; i < nQueries; i++) {
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			String instruction = scanner.nextLine();
			
			if(instruction.equals("Insert")){
				int x,y;
				String[] str = scanner.nextLine().split(" ");
				x = Integer.parseInt(str[0]);
				y = Integer.parseInt(str[1]);
				arrList.add(x, y);
				
			}else if(instruction.equals("Delete")) {
				int x = scanner.nextInt();
				arrList.remove(x);
				
			}else {
				System.out.println("Unknown operation!");
			}
		}
		
		//System.out.println(arrList);
		
		for(Integer i : arrList) {
			System.out.print(i + " ");
		}
		
		

//				bufferedWriter.newLine();
//				bufferedWriter.close();

		scanner.close();
	}

}
