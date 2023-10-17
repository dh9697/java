package java231017;

import java.util.Arrays;

public class java231017_02 {
	public static void main(String[] args) {
//		얉은 복사 : 원래 배열 주소 값만 복사
//		- 복사한 배열을 수정하면 원래 배열도 수정 됨.
//		- 단순 배열 변수 선언을 통한 방법. int B[] = A;
		int A[] = {1, 2, 3, 4, 5};
		int B[] = A;
		
		B[0] = 1000;
		
		System.out.println("A : "+Arrays.toString(A));
		System.out.println("B : "+Arrays.toString(B));
		
//		원래 배열의 실제 값을 복사
//		- 복사한 배열을 수정해도 원래 배열은 바뀌지 않음.
//		- 새로운 메모리 공간에 복사
//		- 배열.clone();
		int C[] = {1, 2, 3, 4, 5};
		int D[] = A.clone();
		
		D[0] = 1000;
		
		System.out.println("C : "+Arrays.toString(C));
		System.out.println("D : "+Arrays.toString(D));
	}  
}
