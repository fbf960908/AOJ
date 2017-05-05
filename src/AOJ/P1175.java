package AOJ;

import java.util.Scanner;

public class P1175 {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while(cin.hasNext()){
			int a = cin.nextInt();
			int b = cin.nextInt();
			if(a==0&&b==0)
				break;
			double sum = (a+b)/2.0*(b-a+1);
			System.out.println((int)sum);
		}
		cin.close();
	}
}