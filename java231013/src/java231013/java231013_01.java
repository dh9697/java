package java231013;

import java.util.Scanner;

public class java231013_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number.");
		num = s.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i%2 != 0)
				System.out.print(i+" ");
		}
		
		s.close();
	}
}
