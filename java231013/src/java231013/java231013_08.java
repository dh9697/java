package java231013;

import java.util.Scanner;

public class java231013_08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number.");
		num = s.nextInt();
		
		for(int i=0; i<num; i++) {
				for(int k=0; k<i+1; k++) {
					System.out.print("*");
				}
				System.out.println("");
		}
		s.close();
	}
}
