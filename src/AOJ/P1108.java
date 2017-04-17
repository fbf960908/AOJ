package AOJ;

import java.util.Scanner;

public class P1108 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			if (a > 100 || a < 0)
				System.out.println("Score is error!");
			if (a >= 90 && a <= 100)
				System.out.println("A");
			if (a >= 80 && a <= 89)
				System.out.println("B");
			if (a >= 70 && a <= 79)
				System.out.println("C");
			if (a >= 60 && a <= 69)
				System.out.println("D");
			if (a >= 0 && a <= 59)
				System.out.println("E");
		}
		cin.close();
	}
}
