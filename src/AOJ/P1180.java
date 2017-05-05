package AOJ;

import java.util.Arrays;
import java.util.Scanner;

public class P1180 {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int [] ss = new int[5];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = cin.nextInt();
		}
		Arrays.sort(ss);
		System.out.println(ss[0]+" "+ss[4]);
		cin.close();
	}
}