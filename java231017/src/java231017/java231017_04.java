package java231017;

import java.util.Scanner;

public class java231017_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score[] = new int[5];
		int hap = 0;
		double avg;
		
		System.out.println("�迬�� ���� ��Ⱑ �������ϴ�~~");
		
		for(int i = 0; i<5; i++) {
			System.out.print("�� ���� ==> ");
			score[i] = s.nextInt();
		}
		
		for(int i = 0; i<5; i++) {
			hap += score[i];
		}
		avg = (double) hap / 5;
		
		System.out.printf("�ɻ����� ��� ����:  %5.2f", avg);
		s.close();
	}
}
