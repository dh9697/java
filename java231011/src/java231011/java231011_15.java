package java231011;

import java.util.Scanner;

public class java231011_15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		
		System.out.println("<������>\n���ڸ� �Է����ּ���.");
		num = s.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+ (num * i));
		}
		
		s.close();
	}
}
