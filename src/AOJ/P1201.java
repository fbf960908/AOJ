package AOJ;

import java.util.Scanner;

public class P1201 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int num = 0;
		for (int i = a; i <= b; i++)
			if (i % 3 == 0 && i % 5 == 0)
				num++;
		System.out.println(num);
	}
}