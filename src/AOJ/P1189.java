package AOJ;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class P1189 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		HashMap<Character, Integer> ss = new HashMap<>();
		while (cin.hasNext()) {
			String str = cin.nextLine();
			if (str.equals("%%%"))
				break;
			String[] s = str.split(" = ");
			ss.put(s[0].charAt(0), Integer.parseInt(s[1]));
		}
		while (cin.hasNext()) {
			String str = cin.nextLine();
			String s = str.replaceAll(" ", "");
			int ans = ss.get(s.charAt(0));
			for (int i = 1; i < s.length();) {
				char a = s.charAt(i++);
				char b = s.charAt(i++);
				if (a == '+')
					ans += ss.get(b);
				if (a == '-')
					ans -= ss.get(b);
				if (a == '*')
					ans *= ss.get(b);
			}
			System.out.println(ans);
		}

		cin.close();
		cout.close();
	}
}