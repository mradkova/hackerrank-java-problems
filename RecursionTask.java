public class RecursionTask {
	public static void main(String[] args) {
		System.out.println(foo("roulette"));
	}

	public static String foo(String input) {
		if (input.length() == 1) {
			return input;
		}
		return foo(input.substring(1)).concat(input.substring(0, 1));
	}
}
