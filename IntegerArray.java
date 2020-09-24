import java.util.Arrays;

public class IntegerArray {

	public static int[] getUnique(int[] a, int[] b) {
		// Arrays.sort(a);
		Arrays.sort(b);
		int aLen = a.length;
		int bLen = b.length;

		int[] result = new int[aLen];
		int k = 0;

//		if((a[aLen -1] < b[0]) || (b[bLen-1] < a[0]))
//			return a;

		for (int i = 0; i < aLen; i++) {
			int j = 0;
			boolean flag = false;
			while (j < bLen && a[i] >= b[j]) {
				if (a[i] == b[j]) {
					flag = true;
					break;
				}
				j++;
			}
			if (!flag) {
				result[k] = a[i];
				k++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 7, 8, 9, 2, 4, 5, 10 };
		int[] b = { 34, 5, 6, 7, 8, 9, 10, 34, 45, 24, 12, 56 };

		int[] result = getUnique(a, b);
		System.out.println(Arrays.toString(result));
	}

}
