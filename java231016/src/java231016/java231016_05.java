package java231016;

import java.util.Scanner;

public class java231016_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ary1[] = {100, 200, 300, 400};
		int[] ary2 = {100, 200, 300};
		int ary3[];
		ary3 = new int[] {100, 200};
		int[] ary4 = new int[1];
		ary4[0] = 100;
		
		for(int i = 0; i<4; i++) {
			System.out.printf("ary1[%d] ==> %d\t", i, ary1[i]);
		}
		System.out.println("");
		
		for(int i = 0; i<3; i++) {
			System.out.printf("ary2[%d] ==> %d\t", i, ary2[i]);
		}
		System.out.println("");
		
		for(int i = 0; i<2; i++) {
			System.out.printf("ary3[%d] ==> %d\t", i, ary3[i]);
		}
		System.out.println("");
		
		for(int i = 0; i<1; i++) {
			System.out.printf("ary4[%d] ==> %d",i ,ary4[i]);
		}
		
		s.close();
	}
}
