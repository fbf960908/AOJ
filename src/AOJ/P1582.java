package AOJ;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class P1582 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int size = cin.nextInt();
		LinkedList<Integer> v = new LinkedList<Integer>();

		for (int i = 0; i < size; i++)
			v.add(cin.nextInt());
		Vector<Integer> w = new Vector<Integer>();
		for (int i = 0; i < size; i++) {
			w.add(v.pollFirst());
			if (v.isEmpty())
				break;
			v.add(v.pollFirst());
		}

		cout.print(w.get(0));
		for (int i = 1; i < w.size(); i++)
			cout.print(" " + w.get(i));

		cin.close();
		cout.close();
	}

}