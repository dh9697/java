package java231012;

import java.util.Scanner;

public class java231012_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		int i = 0;
//		
//		while(i<20) {
//			System.out.println(i+"hi");
//			i++;	
//		while(true) {
//			System.out.println(i+"hi");
//			i++;
//			
		int hap = 0;
		int num1, num2;
		
		while(true) {
			System.out.println("���� 1 ==> ");
			num1 = s.nextInt();
			System.out.println("���� 2 ==> ");
			num2 = s.nextInt();
			
			hap = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + hap);
//			s.close(); ���ѷ��������� ���� ���� ���� ������ �𸣴ϱ�!
			
		s.close();
		}
	}
}
