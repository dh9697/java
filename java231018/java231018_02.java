package java231018;

import java.util.Calendar;

public class java231018_02 {
	public static void main(String[] args) {
		Month today = null;
		
		Calendar cal = Calendar.getInstance();
		
//		MONTH�� 0~11���� ��, DAY_OF_MONTH�� �� ���� �� ��° ��¥����
//		case�� 0���� 11�����ϸ� +1�� �����൵ ��.
		
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
			System.out.println("���� ���� ��");
		}else {
			System.out.println("9���� ���� ����");
		}
	}
}
