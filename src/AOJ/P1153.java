package AOJ;

public class P1153 {

	public static void main(String[] args) {
		int a = 0;
		for (int i = 100; i < 200; i++) {
			if (isPrime(i))
				a++;
		}
		System.out.println(a);
		for (int i = 100; i < 200; i++) {
			if (isPrime(i) && i != 199)
				System.out.print(i + " ");
			else if (isPrime(i))
				System.out.print(i);
		}
	}

	private static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int c = 3; c * c <= n; c += 2) {
			if (n % c == 0)
				return false;
		}
		return true;
	}
}