package java231018;

import java.util.Calendar;

public class java231018_02 {
	public static void main(String[] args) {
		Month today = null;
		
		Calendar cal = Calendar.getInstance();
		
//		MONTH는 0~11까지 달, DAY_OF_MONTH는 그 달의 몇 번째 날짜인지
//		case를 0부터 11까지하면 +1을 안해줘도 됨.
		
		int month = cal.get(Calendar.MONTH)+1;
		
		switch(month) {
			case 1: today = Month.JANUARY; break;
			case 2: today = Month.FEBRUARY; break;
			case 3: today = Month.MARCH; break;
			case 4: today = Month.APRIL; break;
			case 5: today = Month.MAY; break;
			case 6: today = Month.JUNE; break;
			case 7: today = Month.JULY; break;
			case 8: today = Month.AUGUST; break;
			case 9: today = Month.SEPTEMBER; break;
			case 10: today = Month.OCTOBER; break;
			case 11: today = Month.NOVEMBER; break;
			case 12: today = Month.DECEMBER; break;
		}
		
		if(today == Month.SEPTEMBER) {
			System.out.println("다혜 생일 달");
		}else {
			System.out.println("9월이 제일 좋아");
		}
	}
}
