package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
 
public class P1802新生舞会 {
 
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
 
    public static void main(String[] args) {
        int N = cin.nextInt();
        Student[] ss = new Student[N];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = new Student();
            ss[i].set(cin.next(), cin.next(), cin.next());
        }
        int M = cin.nextInt();
        for (int i = 0; i < M; i++) {
            String a = cin.next();
            String b = cin.next();
            ;
            if (findsex(ss, a).equals(findsex(ss, b))) {
				System.out.println("N");
			} else {
				System.out.println("Y");
			}
        }
        cin.close();
        cout.close();
    }
 
    private static String findsex(Student[] ss, String a) {
        for (Student element : ss) {
            if (element.getName().equals(a) || element.getNum().equals(a)) {
				return element.getSex();
			}
        }
        return null;
    }
 
    static class Student {
        String name;
        String num;
        String sex;
 
        public String getName() {
            return name;
        }
 
        public String getNum() {
            return num;
        }
 
        public String getSex() {
            return sex;
        }
 
        public void set(String name, String num, String sex) {
            this.name = name;
            this.num = num;
            this.sex = sex;
        }
    }
}