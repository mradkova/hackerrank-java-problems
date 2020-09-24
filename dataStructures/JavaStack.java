package dataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class JavaStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Stack<String> s = new Stack<>();
		Deque<Character> stack = new ArrayDeque<Character>();

		whileBody: while (sc.hasNext()) {
			String input = sc.next();
			char[] charArray = input.toCharArray();
			for (char c : charArray) {
				// [] {} ()
				if (stack.isEmpty() && (c == ']' || c == '}' || c == ')')) {
					System.out.println("false");
					continue whileBody;
				}
				if (c == '[' || c == '{' || c == '(') {
					stack.push(c);
				}
				if (c == ']' || c == '}' || c == ')') {
					char ch = stack.pop();
					if ((c == ']' && ch != '[') || (c == '}' && ch != '{') || (c == ')' && ch != '(')) {
						System.out.println("false");
						continue whileBody;
					} else
						System.out.println("true");
				}
			}
		}

		sc.close();
	}
}
