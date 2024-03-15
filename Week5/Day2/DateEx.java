package dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:mm:ss");
		String now = sdf.format(d);
		
		System.out.println(now);
		
		Date d2 = new Date(1);
		System.out.println(d2);
	}

}
