package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class P1583¿®∫≈∆•≈‰ {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.next();
			System.out.println(panduan(str) ? "YES" : "NO");
		}
		cin.close();
		cout.close();
	}

	private static boolean panduan(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (char s : str.toCharArray()) {
			if (s == '(' || s == '{')
				stack.push(s);
			else if (s == ')') {
				if (stack.isEmpty() || stack.peek() != '(')
					return false;
				stack.pop();
			} else if (s == '}') {
				if (stack.isEmpty() || stack.peek() != '{')
					return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
