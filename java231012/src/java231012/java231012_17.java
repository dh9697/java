package java231012;

import java.util.Scanner;

public class java231012_17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number.");
		num = s.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int k=0; k<num; k++) {
				if(i == 0 || i == num-1 || k == 0 || k == num-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
		s.close();
	}
}
