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
		
//		Math.abs() ���밪
//		Math.log() �αװ�
//		Math.max() �ִ밪
//		Math.min() �ּҰ�
//		Math.sin(), Math.cos(), Math.tan() �ﰢ�Լ�
		
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
		System.out.println("�ʱ���� ������ �Է��ϼ��� :");
		score = s.nextInt();
		System.out.println(score >= 70);
		
//		�񱳿�����(==)�� ���Կ�����(=)
//		int n1 = 100, n2 = 200;
//		System.out.print(n1 = n2);
//		n1�� n2 ���� ������� �ǹ��̹Ƿ� 200�� ��� ��

		
		s.close();
	}
	
}
