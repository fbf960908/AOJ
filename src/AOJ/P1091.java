package AOJ;

import java.util.Scanner;

public class P1091 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String a = cin.nextLine();
		if (isHui(a))
			System.out.println("Y");
		else
			System.out.println("N");
	}

	private static boolean isHui(String i) {
		return new StringBuffer(i).reverse().toString().equalsIgnoreCase(i);
	}

}