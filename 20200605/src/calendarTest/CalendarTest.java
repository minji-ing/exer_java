package calendarTest;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		long millis = System.currentTimeMillis(); //1970.1.1 날짜부터 경과시간
		System.out.println(millis/1000/24/60/60); //몇일 경과
		Date d = new Date(); //오늘
		System.out.println(d);
		Date dd = new Date(d.getTime() + 24*60*60*1000); //하루 후
		System.out.println(dd);
		
		Calendar cal1991 = Calendar.getInstance();
		//cal1991.set(1991, 8, 10); //0월~11월
		cal1991.set(1991, Calendar.SEPTEMBER, 10); //0월~11월
		Calendar today = Calendar.getInstance();
		printCalendar(today);
		
		long minus = today.getTimeInMillis() - cal1991.getTimeInMillis();
		System.out.println(minus); //1977.5.6~오늘 msec
		System.out.println(minus/1000/24/60/60); //1991년부터 몇일 경과
	}
	public static void printCalendar(Calendar c) {
		System.out.println("--------------------------------");
		System.out.println(c.get(Calendar.YEAR)); //몇 년
		System.out.println(c.get(Calendar.MONTH) + 1); //몇 월
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //몇 일
		System.out.println(c.get(Calendar.AM_PM)); //1PM, 0AM
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //몇 시 Calendar.HOUR
		System.out.println(c.get(Calendar.MINUTE)); //몇 분
		System.out.println(c.get(Calendar.SECOND)); //몇 초
		System.out.println("--------------------------------");
	}
}

