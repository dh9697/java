package java230927;

import java.util.Scanner;

public class java230927_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		System.out.println("���� ������ �Է��ϼ���.");
//		int score;
//		score = s.nextInt();
//		System.out.println(score >= 70);
		
		System.out.println("���� ������ �Է��ϼ���.");
		int score;
		score = s.nextInt();
		if((score >= 70) && (score <= 100)) {
			System.out.println("�հ��Դϴ�.");
		}else if((score >= 0) && (score < 70)){
			System.out.println("���հ��Դϴ�.");
		}else {
			System.out.println("������ �ٽ� Ȯ�����ּ���.");
		}
		
		s.close();
	}

}
