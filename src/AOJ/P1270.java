package AOJ;

import java.util.Arrays;
import java.util.Scanner;

public class P1270 {
	static class rectangle implements Comparable<rectangle> {
		int no;
		int a;
		int b;

		public String toString() {
			return no + " " + a + " " + b;
		}

		public rectangle(int no, int x, int y) {
			super();
			this.no = no;
			this.a = x;
			this.b = y;
		}

		public int compareTo(rectangle that) {
			if (this.no != that.no)
				return this.no - that.no;
			if (this.a != that.a)
				return this.a - that.a;
			return this.b - that.b;
		}

	}

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int o;
		while (n-- > 0) {
			int x = cin.nextInt();
			rectangle[] rectangles = new rectangle[x];
			while (x-- > 0) {
				rectangles[x] = new rectangle(cin.nextInt(), cin.nextInt(), cin.nextInt());
				if (rectangles[x].a < rectangles[x].b) {
					o = rectangles[x].a;
					rectangles[x].a = rectangles[x].b;
					rectangles[x].b = o;
				}
			}
			Arrays.sort(rectangles);
			System.out.println(rectangles[0]);
			rectangle visted = rectangles[0];
			for (int i = 1; i < rectangles.length; i++) {
				if (rectangles[i].a == visted.a && rectangles[i].b == visted.b && rectangles[i].no == visted.no)
					continue;
				System.out.println(rectangles[i]);
				visted = rectangles[i];
			}
		}
	}
}