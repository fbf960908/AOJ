package AOJ;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P1140and1251 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String str = cin.nextLine();
			Date date = new Date(str);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		}
	}
}