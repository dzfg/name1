package page;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR,2019);
		c.set(Calendar.MONTH,7);
		c.set(Calendar.DATE, 7);
		c.add(Calendar.DAY_OF_MONTH,-50);
		int year=c.get(Calendar.YEAR);
		int moth=c.get(Calendar.MONTH)+1;
		int date=c.get(Calendar.DATE);
		System.out.println(year+"Äê"+moth+"ÔÂ"+date+"ÈÕ");
	}
}
