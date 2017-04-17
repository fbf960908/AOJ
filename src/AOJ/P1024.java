package AOJ;

import java.util.Scanner;

public class P1024 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		long sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += jiechen(i);
		}
		System.out.println(sum);
	}

	public static long jiechen(int num) {
		return num == 1 ? 1 : num * jiechen(num - 1);
	}
}
