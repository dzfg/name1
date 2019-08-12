package page;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Text1 {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("今天是yyyy年MM月dd日", Locale.CHINA);
		Date d2 = new Date();
		String s = sdf.format(d2);
		System.out.println(s);
		
		try {
			Date d=sdf.parse("今天是2019年8月8日");
			System.out.println(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
