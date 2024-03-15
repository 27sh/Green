package dateEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalenderEx {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		Date d = c.getTime();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy년 MM월 dd일 HH시 mm분입니다.");
		System.out.println(sdf.format(d));
		
		//Calender 클래스에서 날짜, 시간 정보를 얻기 위해서는 get() 메소드를 이용한다.
		
		int year = c.get(Calendar.YEAR);
		System.out.println("년도 : " +year);
		int month = c.get(Calendar.MONTH);
		System.out.println();
		System.out.println("월 : " + (month+1));
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("일 : " +day);
		
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 : " +weekday);
		
		int hour = c.get(Calendar.HOUR);
		System.out.println("시간 : " +hour);
		
		int second = c.get(Calendar.SECOND);
		System.out.println("초 : "+second);
		
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar latime = Calendar.getInstance(tz);
		Date la = latime.getTime();
		System.out.println(la);
		
		/*
		String[] tzs = TimeZone.getAvailableIDs();
		int cnt = 0;
		for(String s : tzs) {
			cnt++;
			System.out.println(cnt + ")" +s);
		}
		*/
	}
}
