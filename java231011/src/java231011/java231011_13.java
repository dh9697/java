package java231011;

import java.util.Scanner;

public class java231011_13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int hap = 0;
		
		for(int i = 1001; i <= 2000; i+=2) {
			hap += i;
			System.out.println(hap);
		}
//		System.out.println("1000���� 2000���� Ȧ���� �հ�: "+hap);
		
		int hap1, hap2;
		
		System.out.println("���� �ΰ��� �Է����ּ���.");
		hap1 = s.nextInt();
		hap2 = s.nextInt();
		
		for(int i = hap1+1; i <= hap2; i+=2) {
			System.out.println(hap1 += i);
		}
		System.out.println("���� �Է��� ���ں��� ���߿� �Է��� ���ڱ��� Ȧ���� �հ�: "+hap1);
		
		s.close();
	}
}
