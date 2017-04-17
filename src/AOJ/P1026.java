package AOJ;

import java.util.Scanner;

public class P1026 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int n = cin.nextInt();
		int sum = 0, tem = a;
		for (int i = 1; i < n; i++) {
			tem = tem * 10 + a;
			sum += tem;
		}
		System.out.println(sum + a);
	}
}
