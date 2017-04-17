package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class P1117 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			if (a * b == 0)
				break;

			Stack<Integer> stack = new Stack<Integer>();
			for (int i = 99; i >= 0; i--) {
				int num = a * 100 + i;
				if (num % b == 0) {
					stack.push(i);
				}
			}

			while (!stack.isEmpty()) {
				int s = stack.pop();
				if (stack.isEmpty()) {
					if (s < 10)
						System.out.print("0");
					System.out.println(s);
				} else {
					if (s < 10)
						System.out.print("0");
					System.out.print(s + " ");
				}
			}
		}
		cin.close();
		cout.close();
	}
}
