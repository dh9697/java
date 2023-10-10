package java231010;

import java.util.Scanner;

public class java231010_06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		String operation;
		
		System.out.println("Please enter the number1.");
		num1 = s.nextInt();
		
		System.out.println("Please enter the operation symbol(+, -, *, /, %).");
		operation = s.next();
		
		System.out.println("Please enter the number2.");
		num2 = s.nextInt();
		
		if((num1 >= 0) && (num2 >= 0)) {
			if(operation.equals("+")) 
				System.out.println(num1+operation+num2+"="+(num1+num2));
			else if(operation.equals("-")) 
				System.out.println(num1+operation+num2+"="+(num1-num2));
			else if(operation.equals("*")) 
				System.out.println(num1+operation+num2+"="+(num1*num2));
			else if(operation.equals("/")) {
				System.out.print(num1+operation+num2+"=");
				System.out.println(String.format("%.6f", num1/num2);
				if(num1 == 0 || num2 == 0) {
					System.out.println("0 is not divisible.");
				}
			else if(operation.equals("%")) {
				System.out.println(num1+operation+num2+"="+(num1%num2));
		}else if((num1 < 0) && (num2 < 0)) 
			System.out.println("Please enter only numbers greater than or equal to 0.");
						
		s.close();	
	}
}
