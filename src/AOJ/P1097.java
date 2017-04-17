package AOJ;

import java.util.Scanner;

public class P1097 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		String str1 = new StringBuffer(str).reverse().toString();
		System.out.println(str1);
		cin.close();
	}

}
