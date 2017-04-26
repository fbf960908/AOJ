package AOJ;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			Stack<Integer> ss = new Stack<Integer>();
			ss.push(0);
			int max = 0, num = -1;
			while (n-- > 0) {
				int a = cin.nextInt();
				if (a > ss.peek()) {
					ss.push(a);
					num++;
				}

				while (a <= ss.peek()) {
					ss.pop();
				}
				if (ss.peek() != 0)
					max++;
				if (num > max)
					max = num;
				ss.push(a);
			}
			System.out.println(max);
		}
		cin.close();
	}
}