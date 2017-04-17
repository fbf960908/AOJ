package AOJ;

import java.util.Scanner;

public class P1570 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		scanner.nextLine();
		String[] lines = new String[c];
		int i = 0;
		while (c-- > 0) {
			lines[i] = scanner.nextLine();
			System.out.println(lines[i]);
			i++;
		}
		scanner.close();
	}
}
