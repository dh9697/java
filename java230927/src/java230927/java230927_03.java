package java230927;

import java.util.Scanner;

public class java230927_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		System.out.println("1���� 20���� �߿��� ���� �����ϴ� ���ڸ� �����");
		num = s.nextInt();
		
		if(num == 19) {
			System.out.println("��~ ����!");
		}else if((num >= 1) && (num < 9)) {
			System.out.println("�� �ڸ� �����Դϴ�.");
		}else if((num < 19) && (num >= 10)) {
			System.out.println("�ƽ��׿� ��");
		}else{
			System.out.println("����� �ϼ��� ��");
		}
		
		s.close();
	}
	
}
