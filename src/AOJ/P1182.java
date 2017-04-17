package AOJ;

import java.util.Scanner;

public class P1182 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int s = cin.nextInt();
		String Test = cin.nextLine();
		while (s-- > 0) {
			String str = cin.nextLine();
			StringBuffer sb = new StringBuffer();
			if (str != null) {
				for (int i = 0; i < str.length(); i++) {
					char c = str.charAt(i);
					if (Character.isUpperCase(c)) {
						sb.append(Character.toLowerCase(c));
					} else if (Character.isLowerCase(c)) {
						sb.append(Character.toUpperCase(c));
					}
				}
			}
			System.out.println(sb);
		}
	}
}
