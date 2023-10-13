package java231013;

import java.util.Scanner;

public class java231013_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Enter two numbers.");
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		int res = 1;
		for(int i=1; i<num2; i++) {
			res *= num1;
		}
		System.out.println(num1 +"^"+ num2 +" = "+ res);
		
		s.close();
	}
}
