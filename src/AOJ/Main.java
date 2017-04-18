package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		double [] a = new double [n+2];
		double [] c = new double [n];
		a[0] = cin.nextDouble();
		a[n+1] = cin.nextDouble();
		for (int i = 0; i < n; i++) {
			a[i] = cin.nextDouble();
		}
		
		cin.close();
		cout.close();
	}
}