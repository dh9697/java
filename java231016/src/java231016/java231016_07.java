package java231016;

import java.util.Arrays;
import java.util.Scanner;

public class java231016_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ary[] = {10, 20, 30};
		
		System.out.println("현재 배열의 길이 : "+ary.length);
		System.out.println("현재 배열의 내용 : ");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
//		배열명 = Arrays.copyOf(배열명, 새로운 길이);
		ary = Arrays.copyOf(ary, ary.length + 2);
		
		System.out.println("새 배열의 길이 : "+ary.length);
		System.out.println("새 배열의 내용 : ");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
		
		s.close();
	}
}
