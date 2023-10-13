package java231012;

import java.util.Scanner;

public class java231012_16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number.");
		num = s.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int k=num-1; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		s.close();
	}	
}
