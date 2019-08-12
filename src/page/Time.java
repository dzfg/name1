package page;

import java.util.Calendar;

public class Time {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR,2019);
		c.set(Calendar.MONTH,10);
		c.set(Calendar.DATE, 1);
		long time1=c.getTimeInMillis();
		
		c.set(Calendar.YEAR,2019);
		c.set(Calendar.MONTH,8);
		c.set(Calendar.DATE, 8);
		long time2=c.getTimeInMillis();
		long t=(time1-time2);
		System.out.println(t/(24*60*60*1000));
		
		
	}

}
