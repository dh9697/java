package java231016;

import java.util.Scanner;

public class java231016_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numAry[] = new int[4];
		int hap = 0;
		
		for(int i = 0; i<=3; i++) {
			System.out.println("���� : ");
			numAry[i] = s.nextInt();
		}
		
		hap = numAry[0] + numAry[1] + numAry[2] + numAry[3];
		System.out.println("�հ� ==> "+hap);
		s.close();
	}
}
