package test;

import java.util.Scanner;

public class javaTest7 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		double num1 ,num2;
		System.out.println("두개의 숫자를 입력하세요");
		num1 = s.nextDouble();
		num2 = s.nextDouble();
		double resAdd = num1 + num2;
		double resSub = num1 - num2;
		double resMul = num1 * num2;
		double resDiv = num1 / num2;
		System.out.println("Add :" + num1+"+"+num2+"="+resAdd);
		System.out.println("Substract :"+num1+"-"+num2+"="+resSub);
		System.out.println("Mul :"+num1+"*"+num2+"="+resMul);
		System.out.println("Divide :"+num1+"/"+num2+"="+resDiv);
		
		s.close();
	}
}
