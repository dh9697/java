package java231016;

import java.util.Arrays;
import java.util.Collections;

public class java231016_09 {
	public static void main(String[] args) {
		int[] numAry = {3, 5, 1, 9, 7};
		Arrays.sort(numAry);
		for(int data : numAry) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		String[] strAry = {"�Ѻ�", "��ī����", "����", "�ڹ�", "����"};
		Arrays.sort(strAry, Collections.reverseOrder());
		for(String data : strAry) {
			System.out.print(data + " ");
		}
	}
}
