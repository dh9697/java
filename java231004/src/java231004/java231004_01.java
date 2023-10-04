package java231004;

import java.util.Scanner;

public class java231004_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1, n2, n3, answer;
		n1 = 3;
		n2= 4;
		n3 = 5;
		answer = n3 + n1 * n2;
		System.out.println(answer);
		
		double num;
		num = Math.pow(3,2);
		System.out.println(num);
		num = Math.pow(4,3);
		System.out.println(num);
		
//		Math.abs() 절대값
//		Math.log() 로그값
//		Math.max() 최대값
//		Math.min() 최소값
//		Math.sin(), Math.cos(), Math.tan() 삼각함수
		
		int number;
		number = 100;
		number = 100 * 200;
		number = Integer.parseInt("100") + Integer.parseInt("200");
		System.out.println(number);
		
		int num2;
		num2 = 100;
		num2 = num2 + 200;
		System.out.println(num2);
		num2 = num2 + 100;
		System.out.println(num2);
		
		int num3;
		num3 =  10;
		num3++;
		System.out.println(num3);
		num3--;
		System.out.println(num3);
		num3 += 10;
		System.out.println(num3);
		num3 -= 10;
		System.out.println(num3);
		num3 *= 10;
		System.out.println(num3);
		num3 /= 10;
		System.out.println(num3);
		num3 %= 10;
		System.out.println(num3);

		int score;
		System.out.println("필기시험 점수를 입력하세요 :");
		score = s.nextInt();
		System.out.println(score >= 70);
		
//		비교연산자(==)와 대입연산자(=)
//		int n1 = 100, n2 = 200;
//		System.out.print(n1 = n2);
//		n1에 n2 값을 넣으라는 의미이므로 200이 출력 됨

		
		s.close();
	}
	
}
