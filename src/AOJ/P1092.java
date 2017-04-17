package AOJ;

import java.util.Scanner;

public class P1092 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		while (a-- > 0) {
			int s = cin.nextInt();
			huiwen(s);
		}
	}

	private static void huiwen(int s) {
		int num = 0;
		while (true) {
			StringBuffer str = new StringBuffer(String.valueOf(s)).reverse();
			num++;
			if (num > 8) {
				System.out.println("0");
				break;
			}
			if (isHui(s + Integer.parseInt(str.toString()))) {
				System.out.println(num);
				break;
			}
			s = s + Integer.parseInt(str.toString());
		}
	}

	private static boolean isHui(int i) {
		String num = String.valueOf(i);
		return new StringBuffer(num).reverse().toString().equalsIgnoreCase(num);
	}
}