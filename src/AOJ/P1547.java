package AOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class P1547 {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while(cin.hasNext()){
			String a = cin.next();
			String b = cin.next();
			BigInteger A = new BigInteger(a);
			BigInteger B = new BigInteger(b);
			A = A.add(B);
			System.out.println(A);
		}
		cin.close();
	}
}