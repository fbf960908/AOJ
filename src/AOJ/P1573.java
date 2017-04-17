package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1573 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int N=scanner.nextInt();
    while (N-->0) {
        String s=scanner.next();
        System.out.println(check(s));
         
    }
    scanner.close();
  }
    private static int check(String s) {
        if (s.length()<=1 || s.length()%2==1) {
            return s.length();
        }
        String rs=new StringBuffer(s).reverse().toString();
        if (rs.equals(s)) {
            return check(s.substring(0,s.length()/2));
        }
        return s.length();
         
    } 
}