package java231016;

import java.util.Scanner;

public class java231016_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numAry[] = new int[4];
		int hap = 0;
		
		System.out.print("���� : ");
		numAry[0] = s.nextInt();
		System.out.print("���� : ");
		numAry[1] = s.nextInt();
		System.out.print("���� : ");
		numAry[2] = s.nextInt();
		System.out.print("���� : ");
		numAry[3] = s.nextInt();
		
		hap = numAry[0] + numAry[1] + numAry[2] + numAry[3];
		System.out.println("�հ� ==>"+hap);
		
		s.close();
	}
}