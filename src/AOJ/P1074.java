package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1074 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int AH = cin.nextInt();
			int AM = cin.nextInt();
			int AS = cin.nextInt();
			int BH = cin.nextInt();
			int BM = cin.nextInt();
			int BS = cin.nextInt();
			int NS = AS + BS;
			int NM = AM + BM;
			int NH = AH + BH;
			if (NS > 59) {
				NS -= 60;
				NM++;
			}
			if (NM > 59) {
				NM -= 60;
				NH++;
			}
			System.out.println(NH + " " + NM + " " + NS);
		}

		cin.close();
		cout.close();
	}
}
