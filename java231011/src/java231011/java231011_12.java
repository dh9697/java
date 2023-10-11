package java231011;

import java.util.Scanner;

public class java231011_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("숫자 두개를 입력해주세요.");
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.println(num1 += num2);
		}
		s.close();
	}	
}
