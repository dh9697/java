package java231016;

import java.util.Arrays;
import java.util.Collections;

public class java231016_10 {
	public static void main(String[] args) {
		int numAry[] = {3, 5 ,1 ,9 ,7};
		
		System.out.print("원본 숫자 : ");
		for(int data : numAry) {
			System.out.print(data + " ");
		}
		
		System.out.print("\n오름차순 : ");
		Arrays.sort(numAry);
		for(int data : numAry) {
			System.out.print(data+" ");
		}
		
		System.out.print("\n내림차순 :");
		Integer[] numAry2 = Arrays.stream(numAry).boxed().toArray(Integer[]::new);
		Arrays.sort(numAry2, Collections.reverseOrder());
		for(int data : numAry2) {
			System.out.print(data +" ");
		}
		
		String strAry[] = {"가나", "삼성", "한국", "엘지", "커피"};
		
		System.out.print("\n원본 글자 : ");
		for(String data : strAry) {
			System.out.print(data + " ");
		}
		
		System.out.print("\n오름차순 : ");
		Arrays.sort(strAry);
		for(String data : strAry) {
			System.out.print(data+" ");
		}
		
		System.out.print("\n내림차순 : ");
		Arrays.sort(strAry, Collections.reverseOrder());
		for(String data : strAry) {
			System.out.print(data+" ");
		}
	}
}
