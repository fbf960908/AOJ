package AOJ;

import java.util.Scanner;

public class P1313 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		for (int i = 1; i <= num; i++)
			if ((i % 7 == 0) || (i / 1000 == 7) || (i / 100 % 10 == 7) || (i / 10 % 10 == 7) || (i % 10 == 7))
				System.out.println(i);
		cin.close();

	}

}