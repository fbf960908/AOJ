package AOJ;

import java.util.Arrays;
import java.util.Scanner;

public class P1572 {
	static class Pipe implements Comparable<Pipe> {
		int length;
		int diameter;
		int number;

		@Override
		public int compareTo(Pipe that) {
			if (this.length != that.length)
				return this.length - that.length;
			if (this.diameter != that.diameter)
				return that.diameter - this.diameter;
			return this.number - that.number;
		}
	}

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			Pipe[] pipes = new Pipe[cin.nextInt()];
			for (int i = 0; i < pipes.length; i++) {
				pipes[i] = new Pipe();
				pipes[i].length = cin.nextInt();
				pipes[i].diameter = cin.nextInt();
				pipes[i].number = cin.nextInt();
			}
			Arrays.sort(pipes);
			System.out.println(pipes[pipes.length - 1].number);
		}
		cin.close();
	}
}
