package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1174图书馆占座for贪心 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		Student[] student = new Student[N];
		for (int i = 0; i < N; i++) {
			student[i] = new Student();
			student[i].set(cin.nextInt(), cin.nextInt());
		}
		Arrays.sort(student);
		System.out.println(select(student, N));
		cout.close();
		cin.close();
	}

	static int select(Student[] student, int n) {
		int num = 1, i = 1;
		for (int j = 2; j < n; j++) {
			if (student[j].start >= student[i].end) {
				i = j;
				num++;
			}
		}
		return num;
	}

	static class Student implements Comparable<Student> {

		int start;
		int end;

		public int getStart() {
			return start;
		}

		public int getEnd() {
			return end;
		}

		public void set(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Student o) {
			Integer thisend = this.getEnd();
			Integer thatend = o.getEnd();
			return thisend.compareTo(thatend);
		}
	}
}
