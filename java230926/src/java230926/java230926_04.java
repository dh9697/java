package java230926;

import java.util.Scanner;

public class java230926_04 {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		
		int inputValue;
		double onePound = 0.453592;
		double oneKilogram = 2.204623;
		
		System.out.println("�Ŀ��(lb)�� �Է��ϼ��� :");
		inputValue = s.nextInt();
		System.out.println(inputValue + "�Ŀ��(lb)��" + inputValue * onePound + "ų�α׷�(kg)�Դϴ�." );
		System.out.println("ų�α׷�(kg)�� �Է��ϼ��� :");
		inputValue = s.nextInt();
		System.out.println(inputValue + "ų�α׷�(kg)��" + inputValue * oneKilogram + "�Ŀ��(lb)�Դϴ�.");
		
		s.close();
	}
	
}
