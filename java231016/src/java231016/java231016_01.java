package java231016;

import java.util.Scanner;

public class java231016_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2, num3, num4;
		int hap;
		
		System.out.print("number: ");
		num1 = s.nextInt();
		System.out.print("number: ");
		num2 = s.nextInt();
		System.out.print("number: ");
		num3 = s.nextInt();
		System.out.print("number: ");
		num4 = s.nextInt();
		
		hap = num1 + num2 +num3 + num4;
		System.out.println("total ==> "+hap);
		
		s.close();
	}
}
