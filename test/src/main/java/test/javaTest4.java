package test;

import java.util.Scanner;

public class javaTest4 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
	
		int num;
		
		num = s.nextInt();
		System.out.println("사용자가 입력한 값 ==>" + num);
		
		s.close();
		
	}
}

// import java.util.Scanner;
// Scanner s = new Scanner(System.in);
// System.out.println();
// s.close();
