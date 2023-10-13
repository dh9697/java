package java231013;

import java.util.Scanner;

public class java231013_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number.");
		num = s.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<num; i++) {
			if(i>=7 && i%7 ==0)
				sum += i;
		}
		System.out.println("sum = "+sum);
		s.close();
	}
}
