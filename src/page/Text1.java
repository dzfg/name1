package page;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Text1 {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("������yyyy��MM��dd��", Locale.CHINA);
		Date d2 = new Date();
		String s = sdf.format(d2);
		System.out.println(s);
		
		try {
			Date d=sdf.parse("������2019��8��8��");
			System.out.println(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
