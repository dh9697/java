package java230927;

import java.util.Scanner;

public class java230927_01 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 총 매출액 초기화
		int total = 0;
		
		// 구매 금액 입력
		System.out.println("구매 제품의 이름과 가격, 개수를 차례로 적어주세요.");		
		String bItem1, bItem2;
		int bPrice1, bPrice2, bNum1, bNum2;
		bItem1 = s.next();
		bPrice1 = s.nextInt();
		bNum1 = s.nextInt();
		System.out.println("구매 제품: "+bItem1+", 구매 가격: "+bPrice1+"원"+", 구매 개수: "+bNum1+"개");
		
		System.out.println("구매 제품의 이름과 가격, 개수를 차례로 적어주세요.");
		bItem2 = s.next();
		bPrice2 = s.nextInt();
		bNum2 = s.nextInt();
		System.out.println("구매 제품: "+bItem2+", 구매 가격: "+bPrice2+"원"+", 구매 개수: "+bNum2+"개");
		
		// 구매 금액을 더한 총 매출액
		total -= bPrice1*bNum1 + bPrice2*bNum2;
		System.out.println("총 매출액은 "+total+"원 입니다.");
		
		// 판매 금액 입력
		System.out.println("판매 제품의 이름과 가격, 개수를 차례로 적어주세요.");
		String sItem1, sItem2, sItem3, sItem4, sItem5;
		int sPrice1, sPrice2, sPrice3, sPrice4, sPrice5, sNum1, sNum2, sNum3, sNum4, sNum5;
		sItem1 = s.next();
		sPrice1 = s.nextInt();
		sNum1 = s.nextInt();
		System.out.println("판매 제품: "+sItem1+", 판매 금액: "+sPrice1+"원"+", 판매 개수: "+sNum1+"개");
		
		System.out.println("판매 제품의 이름과 가격, 개수를 차례로 적어주세요.");
		sItem2 = s.next();
		sPrice2 = s.nextInt();
		sNum2 = s.nextInt();
		System.out.println("판매 제품: "+sItem2+", 판매 금액: "+sPrice2+"원"+", 판매 개수: "+sNum2+"개");
		
		System.out.println("판매 제품의 이름과 가격, 개수를 차례로 적어주세요.");
		sItem3 = s.next();
		sPrice3 = s.nextInt();
		sNum3 = s.nextInt();
		System.out.println("판매 제품: "+sItem3+", 판매 금액: "+sPrice3+"원"+", 판매 개수: "+sNum3+"개");
		
		System.out.println("판매 제품의 이름과 가격, 개수를 차례로 적어주세요.");
		sItem4 = s.next();
		sPrice4 = s.nextInt();
		sNum4 = s.nextInt();
		System.out.println("판매 제품: "+sItem4+", 판매 금액: "+sPrice4+"원"+", 판매 개수: "+sNum4+"개");
		
		System.out.println("판매 제품의 이름과 가격, 개수를 차례로 적어주세요.");
		sItem5 = s.next();
		sPrice5 = s.nextInt();
		sNum5 = s.nextInt();
		System.out.println("판매 제품: "+sItem5+", 판매 금액: "+sPrice5+"원"+", 판매 개수: "+sNum5+"개");
		
		// 판매 금액까지 더한 총 매출액
		total += sPrice1*sNum1 + sPrice2*sNum2 + sPrice3*sNum3 + sPrice4*sNum4 + sPrice5*sNum5;
		System.out.println("구매 금액과 판매 금액을 결산한 오늘의 총 매출액은 "+total+"원입니다.");
		
		s.close();
	}
}
