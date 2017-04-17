package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1073 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int a = cin.nextInt();
		int num = 0;
		for (int i = 0; i <= a / 5; i++) {
			for (int j = 0; j <= a / 2; j++) {
				for (int k = 0; k <= a; k++) {
					if (i * 5 + j * 2 + k == a && i * j * k != 0) {
						num++;
					}
				}
			}
		}
		System.out.println(num);
		cin.close();
		cout.close();
	}
}
