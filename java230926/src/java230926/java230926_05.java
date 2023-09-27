package java230926;

import java.util.Scanner;

public class java230926_05 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// 총 매출액을 0으로 초기화
		int total = 0;
				
		// 구입한 마이너스 내역 총 매출액에서 빼기
		String buyItem1, buyItem2;
		int buyPrice1, buyPrice2, buyNum1, buyNum2;
		
		System.out.println("구입 품목과 가격, 개수를 차례로 적어주세요.");
		buyItem1 = s.next();
		buyPrice1 = s.nextInt();
		buyNum1 = s.nextInt();
		System.out.println("구입 품목: "+buyItem1+", 구입 가격: " + buyPrice1 + "원, "+"구입 개수: " + buyNum1 + "개");	
		System.out.println("구입 가격과 개수를 차례로 적어주세요.");
		buyItem2 = s.next();
		buyPrice2 = s.nextInt();
		buyNum2 = s.nextInt();
		System.out.println("구입 품목: "+buyItem2+", 구입 가격: " + buyPrice2 + "개, "+"구입 개수: " + buyNum2 + "개");
		total -= buyNum1 * buyPrice1 + buyPrice2 * buyNum2;
		System.out.println("총 금액은"+total+" 원입니다.");
		
		// 판매한 플러스 내역 총 매출액에 더하기
		String sellItem1, sellItem2, sellItem3, sellItem4, sellItem5;
		int sellPrice1, sellPrice2, sellPrice3, sellPrice4, sellPrice5;
		int sellNum1, sellNum2, sellNum3, sellNum4, sellNum5;
		
		System.out.println("판매 품목과 가격, 개수를 차례로 적어주세요.");
		sellItem1 = s.next();
		sellPrice1 = s.nextInt();
		sellNum1 = s.nextInt();
		System.out.println("판매 품목: "+ sellItem1 + ", 판매 가격: "+sellPrice1+"원, "+sellNum1+"개");
		sellItem2 = s.next();
		sellPrice2 = s.nextInt();
		sellNum2 = s.nextInt();
		System.out.println("판매 품목: "+ sellItem2 + ", 판매 가격: "+sellPrice2+"원, "+sellNum2+"개");
		sellItem3 = s.next();
		sellPrice3 = s.nextInt();
		sellNum3 = s.nextInt();
		System.out.println("판매 품목: "+ sellItem3 + ", 판매 가격: "+sellPrice3+"원, "+sellNum3+"개");
		sellItem4 = s.next();
		sellPrice4 = s.nextInt();
		sellNum4 = s.nextInt();
		System.out.println("판매 품목: "+ sellItem4 + ", 판매 가격: "+sellPrice4+"원, "+sellNum4+"개");
		sellItem5 = s.next();
		sellPrice5 = s.nextInt();
		sellNum5 = s.nextInt();
		System.out.println("판매 품목: "+ sellItem5 + ", 판매 가격: "+sellPrice5+"원, "+sellNum5+"개");
		
		total += sellPrice1*sellNum1+sellPrice2*sellNum2+sellPrice3*sellNum3+sellPrice4*sellNum4+sellPrice5*sellNum5;
		System.out.println("오늘 총 매출액은 "+total+" 원입니다.");
		
		s.close();
		
	}
}
