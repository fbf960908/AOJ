package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1308 {
	
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String args[]) {
		while(cin.hasNext()){
			int s = cin.nextInt();
			double a = 2;
			double b = 1;
			double sum = 0;
			while(s-->0){
				sum+=a*1.0/b;
				double c = a;
				a = a+b;
				b = c;
			}
			String str = String.format("%.3f", sum);
			System.out.println(str);
		}
	}
}