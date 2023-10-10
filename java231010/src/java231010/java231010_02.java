package java231010;

import java.util.Scanner;

public class java231010_02 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Please enter the number : ");
		num = s.nextInt();
		
		if((num > 0) && (num%2 == 0))
			System.out.println("It's even.");
		else if((num > 0) && (num%2 != 0))
			System.out.println("It's odd.");
		else
			System.out.println("Please enter only positive numbers.");
	
	s.close();
	}
}
	
