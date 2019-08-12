package page;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Text {

	public static void main(String[] args) {
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,Locale.CHINA);
		Date d=new Date();
		String s=df.format(d);
		System.out.println(s);
	}
	
	

}
