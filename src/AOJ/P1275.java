package AOJ;

import java.util.Scanner;

public class P1275 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		float ava = (a + b + c) / 3;
		System.out.println(String.format("%.3f", ava));
	}
}