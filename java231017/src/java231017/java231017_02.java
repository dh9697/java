package java231017;

import java.util.Arrays;

public class java231017_02 {
	public static void main(String[] args) {
//		���� ���� : ���� �迭 �ּ� ���� ����
//		- ������ �迭�� �����ϸ� ���� �迭�� ���� ��.
//		- �ܼ� �迭 ���� ������ ���� ���. int B[] = A;
		int A[] = {1, 2, 3, 4, 5};
		int B[] = A;
		
		B[0] = 1000;
		
		System.out.println("A : "+Arrays.toString(A));
		System.out.println("B : "+Arrays.toString(B));
		
//		���� �迭�� ���� ���� ����
//		- ������ �迭�� �����ص� ���� �迭�� �ٲ��� ����.
//		- ���ο� �޸� ������ ����
//		- �迭.clone();
		int C[] = {1, 2, 3, 4, 5};
		int D[] = A.clone();
		
		D[0] = 1000;
		
		System.out.println("C : "+Arrays.toString(C));
		System.out.println("D : "+Arrays.toString(D));
	}  
}
