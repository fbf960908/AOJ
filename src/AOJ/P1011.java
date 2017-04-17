package AOJ;

public class P1011 {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			int a, b, c;
			a = i / 100 % 10;
			b = i / 10 % 10;
			c = i % 10;
			if (a * a * a + b * b * b + c * c * c == i)
				System.out.println(i);
		}
	}
}