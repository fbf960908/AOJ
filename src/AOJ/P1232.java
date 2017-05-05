package AOJ;

import java.util.Arrays;
import java.util.Scanner;

public class P1232 {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int[] ss = new int[N];
			for (int i = 0; i < ss.length; i++) {
				ss[i] = cin.nextInt();
			}
			Arrays.sort(ss);
			double sum = 0;
			for (int i = 1; i < ss.length - 1; i++) {
				sum += ss[i];
			}
			sum /= (N - 2) * 1.0;
			String str = String.format("%.2f", sum);
			System.out.println(str);
		}
		cin.close();
	}
}