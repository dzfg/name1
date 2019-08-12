package page;

import java.sql.Date;

public class Class {
	public static void main(String[] args) {
		long a=System.currentTimeMillis()-24*60*60*1000;
		Date d=new Date(a);
		Date d2=new Date(a);
		System.out.println(d2.compareTo(d));
	}

}
