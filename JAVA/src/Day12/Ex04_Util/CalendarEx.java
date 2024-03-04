package Day12.Ex04_Util;

import java.util.Calendar;

public class CalendarEx {
	
	// 날짜/시간 정보(Calendar)를 출력하는 메소드
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get( Calendar.YEAR );
		int month = cal.get( Calendar.MONTH ) + 1;			// 월(0~11)
		int day = cal.get( Calendar.DAY_OF_MONTH );
		int dayOfWeek = cal.get( Calendar.DAY_OF_WEEK );	// 일~토(1~7)
		int hour = cal.get( Calendar.HOUR );				// 12시 표시
		int hourOfDay = cal.get( Calendar.HOUR_OF_DAY );	// 24시 표시
		int ampm = cal.get( Calendar.AM_PM );
		int minute = cal.get( Calendar.MINUTE );
		int second = cal.get( Calendar.SECOND );
		int millisecond = cal.get( Calendar.MILLISECOND );
		System.out.print(msg + " : " + year + "/" + month + "/" + day +"/");
		
		
		// 일요일(1) ~ 토요일(7)
		String Day = "";
		switch (dayOfWeek) {
			case Calendar.SUNDAY:		Day = "일요일"; break;
			case Calendar.MONDAY:		Day = "월요일"; break;
			case Calendar.TUESDAY:		Day = "화요일"; break;
			case Calendar.WEDNESDAY:	Day = "수요일"; break;
			case Calendar.THURSDAY:		Day = "목요일"; break;
			case Calendar.FRIDAY:		Day = "금요일"; break;
			case Calendar.SATURDAY:		Day = "토요일"; break;
		}
		System.out.print(Day);
		
		System.out.print("(" + hourOfDay + "시)");
		if( ampm == Calendar.AM )
			System.out.print("오전 ");
		if( ampm == Calendar.PM )
			System.out.print("오후 ");
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	}

	public static void main(String[] args) {
		// * new Calendar() 대신, getInstance() 메소드로 객체를 사용한다.
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);
		
		// 자바 프로그래밍 마지막 수업일
		Calendar test = Calendar.getInstance();
		test.set(2024, Calendar.FEBRUARY, 27);
		printCalendar("자바 마지막 수업일(년/월/일)", test);
		
		test.set(2024, Calendar.FEBRUARY, 27, 18, 30, 0);
		printCalendar("자바 마지막 수업일(년~초)", test);
		
		// 종강일
		Calendar lastDay = Calendar.getInstance();
		lastDay.set(2024, Calendar.AUGUST, 1, 18, 0, 0);
		
		// - lastDay 	: 종강일
		// - now		: 오늘 (날짜/시간)
		long lastT = lastDay.getTimeInMillis();
		long nowT = now.getTimeInMillis();

		// getTimeInMillis() 	: 날짜를 ms(밀리초) 단위까지 숫자로 반환
		// 1970년 1월 1일 0시 0분 0초 0ms 부터 카운트한 숫자를 반환
		// 0.001초 		: 1ms
		// 60초			: 1분
		// 60분			: 1시간
		// 24시			: 1일
		System.out.println("lastT - nowT = " + (lastT - nowT));
		
		long dDay = (lastT - nowT) / (1000 * 60 * 60 * 24);
		System.out.println("D-day : " + dDay + "일");
		
		long nowD = nowT / (1000 * 60 * 60 * 24);
		long lastD = lastT / (1000 * 60 * 60 * 24);
		System.out.println("1970년 1월 1일 0시 0분 0초 0ms~오늘까지 일 수 : " + nowD);
		System.out.println("1970년 1월 1일 0시 0분 0초 0ms~종강까지 일 수 : " + lastD);
		
		// 내가 태어난 지 몇 일
		Calendar birth = Calendar.getInstance();
		birth.set(2000, Calendar.APRIL, 15, 0, 0 ,0);		// 생일 지정 : 2000/04/15
		long birthD = birth.getTimeInMillis() / (1000 * 60 * 60 * 24);
		long afterBirth = nowD - birthD;
		System.out.println("생후 " + afterBirth + "일이 지났습니다.");
		
		// * 월(MONTH)는  0~11 로 0이 1월을 의미하므로, 1월이면 0으로 지정해야한다.
		// - Calendar.JANUARY (0) 상수값을 가져와서 지정하는 것을 권장
		
		if( now.before(lastDay) ) {
			System.out.println("종강 전입니다.");
		}
		else if( now.after(lastDay) ) {
			System.out.println("수업이 종료된 강의입니다.");
		}
		
	}
}


















