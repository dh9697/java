package java231016;

import java.util.Arrays;
import java.util.Collections;

public class java231016_10 {
	public static void main(String[] args) {
		int numAry[] = {3, 5 ,1 ,9 ,7};
		
		System.out.print("���� ���� : ");
		for(int data : numAry) {
			System.out.print(data + " ");
		}
		
		System.out.print("\n�������� : ");
		Arrays.sort(numAry);
		for(int data : numAry) {
			System.out.print(data+" ");
		}
		
		System.out.print("\n�������� :");
		Integer[] numAry2 = Arrays.stream(numAry).boxed().toArray(Integer[]::new);
		Arrays.sort(numAry2, Collections.reverseOrder());
		for(int data : numAry2) {
			System.out.print(data +" ");
		}
		
		String strAry[] = {"����", "�Ｚ", "�ѱ�", "����", "Ŀ��"};
		
		System.out.print("\n���� ���� : ");
		for(String data : strAry) {
			System.out.print(data + " ");
		}
		
		System.out.print("\n�������� : ");
		Arrays.sort(strAry);
		for(String data : strAry) {
			System.out.print(data+" ");
		}
		
		System.out.print("\n�������� : ");
		Arrays.sort(strAry, Collections.reverseOrder());
		for(String data : strAry) {
			System.out.print(data+" ");
		}
	}
}
