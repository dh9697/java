package test;

import java.util.Scanner;

public class javaTest8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id,password,check,name,gender,email;
		int phone;
		System.out.println("ȸ�� ���� ���");
		System.out.println("���̵� �Է����ּ���");
	    id = s.next();
		System.out.println("��й�ȣ�� �Է����ּ���");
	    password = s.next();
		System.out.println("��й�ȣ�� �ٽ� �Է����ּ���");
		check = s.next();
		System.out.println("�̸��� �Է����ּ���");
		name = s.next();
		System.out.println("������ �Է����ּ���");
		gender = s.next();
		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		phone = s.nextInt();
		System.out.println("�̸����� �Է����ּ���");
		email = s.next();
		System.out.println("���̵� :"+id);
		System.out.println("��й�ȣ :"+password);
		System.out.println("��й�ȣ Ȯ�� :"+check);
		System.out.println("�̸� :"+name);
		System.out.println("���� :"+gender);
		System.out.println("��ȭ��ȣ :"+phone);
		System.out.println("�̸��� :"+email);
		
		s.close();
	}
}
