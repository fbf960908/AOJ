package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1431转啊转 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {

		int T = cin.nextInt();
		while (T-- > 0) {
			double a = cin.nextDouble();
			double b = cin.nextDouble();
			double r = cin.nextDouble();
			double xa = cin.nextDouble();
			double ya = cin.nextDouble();
			double w = cin.nextDouble();
			double t = cin.nextDouble();
			double xb = a + r * Math.cos(w * t);
			double yb = b + r * Math.sin(w * t);
			double d = Math.abs((b - ya) * (xa - xb) - (ya - yb) * (a - xa))
					/ (Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb)));
			double ans = 2 * (Math.sqrt(r * r - d * d));
			String str = String.format("%.2f", ans);
			System.out.println(str);
		}
		cin.close();
		cout.close();
	}
}