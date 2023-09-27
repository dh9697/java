package java230927;

import java.util.Scanner;

public class java230927_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		System.out.println("시험 점수를 입력하세요.");
//		int score;
//		score = s.nextInt();
//		System.out.println(score >= 70);
		
		System.out.println("시험 점수를 입력하세요.");
		int score;
		score = s.nextInt();
		if((score >= 70) && (score <= 100)) {
			System.out.println("합격입니다.");
		}else if((score >= 0) && (score < 70)){
			System.out.println("불합격입니다.");
		}else {
			System.out.println("점수를 다시 확인해주세요.");
		}
		
		s.close();
	}

}
