package java231017;

import java.util.Arrays;

public class java231017_01 {
	public static void main(String[] args) {
		String[] oldAry = {"�ܹ���", "���̽��Ƹ޸�ī��", "����"};
		String[] newAry;
		
		newAry = oldAry;
		
		oldAry[0] = "��ǰ����";
		newAry[1] = "�ų���";
		
		System.out.println("���� �迭 : "+Arrays.toString(oldAry));
		System.out.println("���� �迭 : "+Arrays.toString(newAry));
	}
}
