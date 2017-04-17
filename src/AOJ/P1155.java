package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class P1155 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		String str = cin.nextLine();
		String[] s = str.split("\\s");
		int[] a = new int[4];
		for (int i = 0; i < a.length; i++) {
			if (s[i].equals("A")) {
				a[i] = 1;
				continue;
			}
			if (s[i].equals("J")) {
				a[i] = 11;
				continue;
			}
			if (s[i].equals("Q")) {
				a[i] = 12;
				continue;
			}
			if (s[i].equals("K")) {
				a[i] = 13;
				continue;
			}
			a[i] = Integer.parseInt(s[i]);
		}
		Point24 p = new Point24(a);
		System.out.println(p.solve());
		cin.close();
		cout.close();
	}
}

class Point24 {
	int a[] = new int[4];

	public Point24(int b[]) {
		for (int i = 0; i < 4; i++)
			this.a[i] = b[i];
	}

	public static void main(String[] args) {
		Point24 p = new Point24(new int[] { 5, 5, 5, 1 });
		System.out.println(p.solve());
	}

	final static String OPERATORS[] = "+ - * /".split("\\s+");
	private static final double GOAL = 24.0;

	public String solve() {
		String ops[] = new String[3];
		for (int i = 0; i < 4 * 4 * 4; i++) {
			ops[0] = OPERATORS[i % 4];
			ops[1] = OPERATORS[i / 4 % 4];
			ops[2] = OPERATORS[i / 4 / 4 % 4];
			List<String> exp = new Vector<String>();
			exp.addAll(Arrays.asList(ops));
			for (int t : a)
				exp.add(Integer.toString(t));
			for (int j = 0; j < 5040; j++) {
				Collections.shuffle(exp);
				double val = RPorlandExpression.evalute(exp);
				if (fequal(val, GOAL)) {
					// System.out.println(exp);
					BinaryTree tree = BinaryTree.createBinaryTree(exp);
					StringBuffer buffer = new StringBuffer();
					tree.travel(buffer);
					return "Y";
				}
			}
		}
		return "N";
	}

	private boolean fequal(double x, double y) {
		return Math.abs(x - y) <= 1E-6;
	}
}

class BinaryTree {
	BinaryTree left;
	String root;
	BinaryTree right;

	public BinaryTree(String root) {
		this.root = root;
		left = right = null;
	}

	public static BinaryTree createBinaryTree(List<String> exp) {
		Stack<BinaryTree> stack = new Stack<>();
		for (String e : exp) {
			if (RPorlandExpression.isOperator(e)) {
				BinaryTree cur = new BinaryTree(e);
				BinaryTree right = stack.pop();
				BinaryTree left = stack.pop();
				cur.left = left;
				cur.right = right;
				stack.push(cur);
			} else {
				BinaryTree cur = new BinaryTree(e);
				stack.push(cur);
			}
		}
		return stack.peek();
	}

	public void travel(StringBuffer buffer) {
		if (left != null) {
			buffer.append("(");
			left.travel(buffer);
		}
		buffer.append(root);
		if (right != null) {
			right.travel(buffer);
			buffer.append(")");
		}
	}

	public void travel() {
		if (left != null) {
			System.out.print("(");
			left.travel();
		}
		System.out.print(root);
		if (right != null) {
			right.travel();
			System.out.print(")");
		}
	}
}

class RPorlandExpression {
	final static double ERROR = -1;

	public static double evalute(List<String> exp) {
		Stack<Double> stack = new Stack<>();
		for (String e : exp) {
			if (isNumber(e)) {
				stack.push(Double.parseDouble(e));
			} else if (isOperator(e)) {
				if (stack.size() < 2)
					return ERROR;
				double b = stack.pop();
				double a = stack.pop();
				double c = 0;
				switch (e) {
				case "+":
					c = a + b;
					break;
				case "-":
					c = a - b;
					break;
				case "*":
					c = a * b;
					break;
				case "/":
					if (b == 0)
						return ERROR;
					c = a / b;
					break;
				default:
					return ERROR;
				}
				stack.push(c);
			}
		}
		return stack.size() != 1 ? ERROR : stack.peek();
	}

	public static boolean isOperator(String s) {
		return "+-*/".contains(s) && s.length() == 1;
	}

	public static boolean isNumber(String s) {
		try {
			Double.parseDouble(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}