package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1293 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < N*2-1-2*i; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
		cin.close();
		cout.close();
	}
}
