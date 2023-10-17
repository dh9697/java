package java231017;

public class java231017_03 {
	public static void main(String[] args) {
		String[] 저녁메뉴 = {"치킨", "라면", "쿠겐", "카레","콩불"};
		
		int dinner = (int)(Math.random()*저녁메뉴.length);
		System.out.println("오늘의 저녁 메뉴는 ==> "+저녁메뉴[dinner]);
	}
}
