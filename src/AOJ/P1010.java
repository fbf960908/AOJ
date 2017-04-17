package AOJ;

import java.util.Scanner;

public class P1010 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		int a, b, c;
		a = num / 100;
		b = num % 100 / 10;
		c = num % 10;
		if (a * a * a + b * b * b + c * c * c == num)
			System.out.println("1");
		else
			System.out.println("0");
		cin.close();

	}

}