package java231016;

import java.util.Arrays;
import java.util.Scanner;

public class java231016_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ary[] = {10, 20, 30};
		
		System.out.println("���� �迭�� ���� : "+ary.length);
		System.out.println("���� �迭�� ���� : ");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
//		�迭�� = Arrays.copyOf(�迭��, ���ο� ����);
		ary = Arrays.copyOf(ary, ary.length + 2);
		
		System.out.println("�� �迭�� ���� : "+ary.length);
		System.out.println("�� �迭�� ���� : ");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
		
		s.close();
	}
}
