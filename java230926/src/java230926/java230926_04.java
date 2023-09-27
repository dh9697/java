package java230926;

import java.util.Scanner;

public class java230926_04 {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		
		int inputValue;
		double onePound = 0.453592;
		double oneKilogram = 2.204623;
		
		System.out.println("파운드(lb)를 입력하세요 :");
		inputValue = s.nextInt();
		System.out.println(inputValue + "파운드(lb)는" + inputValue * onePound + "킬로그램(kg)입니다." );
		System.out.println("킬로그램(kg)을 입력하세요 :");
		inputValue = s.nextInt();
		System.out.println(inputValue + "킬로그램(kg)은" + inputValue * oneKilogram + "파운드(lb)입니다.");
		
		s.close();
	}
	
}
