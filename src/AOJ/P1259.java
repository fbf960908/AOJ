package AOJ;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1259 {
	static class Student implements Comparable<Student> {
		static double ENGLISH;
		static double POLITICAL;
		static double MATH;
		static double MAJOR;
		static double FIRST_TOTAL;
		String name;
		double english;
		double political;
		double math;
		double major;
		double review;

		public Student(String name, double english, double political, double math, double major, double review) {
			this.name = name;
			this.english = english;
			this.political = political;
			this.math = math;
			this.major = major;
			this.review = review;
		}

		double getFirstScore() {
			return english + political + math + major;
		}

		double getTotalScore() {
			return getFirstScore() * 0.6 + review * 0.4;

		}

		@Override
		public String toString() {
			return "Student{" + "name='" + name + '\'' + ", english=" + english + ", political=" + political + ", math="
					+ math + ", major=" + major + ", review=" + review + '}';
		}

		public boolean ok() {
			return english >= ENGLISH && math >= MATH && political >= POLITICAL && major >= MAJOR
					&& getFirstScore() >= FIRST_TOTAL;
		}

		@Override
		public int compareTo(Student o) {
			Double thisd = this.getTotalScore();
			Double thatd = o.getTotalScore();
			return thatd.compareTo(thisd);
		}
	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		Student.ENGLISH = cin.nextDouble();
		Student.POLITICAL = cin.nextDouble();
		Student.MATH = cin.nextDouble();
		Student.MAJOR = cin.nextDouble();
		Student.FIRST_TOTAL = cin.nextDouble();
		Vector<Student> vector = new Vector<Student>();
		while (cin.hasNext()) {
			Student s = new Student(cin.next(), cin.nextDouble(), cin.nextDouble(), cin.nextDouble(), cin.nextDouble(),
					cin.nextDouble());
			if (s.ok())
				vector.add(s);
		}
		Collections.sort(vector);
		int no = 1;
		for (Student s : vector) {
			cout.println(String.format("%s %.0f %.0f %.1f %d", s.name, s.getFirstScore(), s.review, s.getTotalScore(),
					no++));
		}
		cin.close();
		cout.close();

	}
}