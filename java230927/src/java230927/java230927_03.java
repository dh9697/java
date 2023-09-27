package java230927;

import java.util.Scanner;

public class java230927_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		System.out.println("1부터 20까지 중에서 내가 생각하는 숫자를 맞춰봐");
		num = s.nextInt();
		
		if(num == 19) {
			System.out.println("올~ 정답!");
		}else if((num >= 1) && (num < 9)) {
			System.out.println("두 자리 숫자입니다.");
		}else if((num < 19) && (num >= 10)) {
			System.out.println("아쉽네연 ㅋ");
		}else{
			System.out.println("제대로 하세연 ㅋ");
		}
		
		s.close();
	}
	
}
