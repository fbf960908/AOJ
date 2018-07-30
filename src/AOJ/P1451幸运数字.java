package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1451幸运数字{

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int s = N;
			int sum = 0;
			while (true) {
				sum += N % 10;
				N /= 10;
				if (N < 10) {
					sum += N;
					break;
				}
			}
			if (s % sum == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		cin.close();
		cout.close();
	}
}