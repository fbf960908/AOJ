package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1508 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int [] a = new int [n];
			int [] b = new int [n];
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}
			for (int i = 0; i < m; i++) {
				b[i] = cin.nextInt();
			}
			int s =cin.nextInt();
			for (int i = 0,j = 0; i < a.length; i++) {
				if(a[i]==b[i]){
					j++;
					continue;
				}
				else{
					if(a[i]!=s)
						System.out.println("NO");
					else
						System.out.println("YES");
					break;
				}
			}
		}
		cin.close();
		cout.close();
	}
}
