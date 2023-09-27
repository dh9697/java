package java230926;

import java.util.Scanner;

public class java230926_01 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("## 지희만의 미연시에 오신걸 환영합니다 ##");
		System.out.println("누나 저랑 진지먹어? yes or no");
		String str = s.next();
		System.out.println(str+"..");
		
		System.out.println("아 근데 지희누나 돈까스 얼마 정도 해요ㅠ?");
		int price = s.nextInt();
		System.out.println("아.."+price+".. 비싸지만 누나랑 먹는다면 먹을게!");		
		
		String str123 = "123";
		int x = Integer.parseInt(str123);
		double y = Double.parseDouble(str123);
		System.out.println(x);
		System.out.println(y);
		
		int num1, num2;
		int resAdd;
		int resSub;
		int resMul;
		double resDiv;
		int resRem;
		
		System.out.println("첫번째 숫자");
		num1 = s.nextInt();
		System.out.println("두번째 숫자");
		num2 = s.nextInt();
		
		resAdd = num1 + num2;
		resSub = num1 - num2;
		resMul = num1 * num2;
		resDiv = (double) num1 / num2 ;
		resRem = num1 % num2;
		
		System.out.println("Add :"+resAdd);
		System.out.println("Sub :"+resSub);
		System.out.println("Mul :"+resMul);
		System.out.println("Div :"+resDiv);
		System.out.println("Rem :"+resRem);
		
		s.close();
	}
}
