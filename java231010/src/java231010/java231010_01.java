package java231010;

import java.util.Scanner;

public class java231010_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("1. input\n2. correction\n3. check\n4. remove\n5. finish");
		System.out.println("\tPlease enter the menu number : ");
		num = s.nextInt();
		
		if(num == 1) {
			System.out.println("\tThis is the input menu.");
		}else if(num == 2) {
			System.out.println("\tThis is the correction menu.");
		}else if(num == 3) {
			System.out.println("\tThis is the check menu.");
		}else if(num == 4) {
			System.out.println("\tThis is the remove menu.");
		}else if(num == 5) {
			System.out.println("\tThis is the finish menu.");
		}else {
			System.out.println("\tYou entered it incorrectly.");
		}
		
		System.out.println("The program ends.");
		
		s.close();
	}
}
