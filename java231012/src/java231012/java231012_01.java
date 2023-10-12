package java231012;

import java.util.Scanner;

public class java231012_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		int i = 0;
//		
//		while(i<20) {
//			System.out.println(i+"hi");
//			i++;	
//		while(true) {
//			System.out.println(i+"hi");
//			i++;
//			
		int hap = 0;
		int num1, num2;
		
		while(true) {
			System.out.println("숫자 1 ==> ");
			num1 = s.nextInt();
			System.out.println("숫자 2 ==> ");
			num2 = s.nextInt();
			
			hap = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + hap);
//			s.close(); 무한루프에서는 닫지 않음 언제 끝날지 모르니까!
			
		s.close();
		}
	}
}
