package test;

import java.util.Scanner;

public class javaTest5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double num;
		System.out.println("�Ǽ��� �Է��ϼ��� :");
		num = s.nextDouble();
		System.out.println("����ڰ� �Է��� �� ==>"+num);
		
		String str;
		System.out.println("���ڿ��� �Է��ϼ���:");
		str = s.next();
		System.out.println("����ڰ� �Է��� �� ==>"+str);
		
		s.close();
	}
}
