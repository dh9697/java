package java231017;

import java.util.Arrays;

public class java231017_01 {
	public static void main(String[] args) {
		String[] oldAry = {"햄버거", "아이스아메리카노", "미쯔"};
		String[] newAry;
		
		newAry = oldAry;
		
		oldAry[0] = "하품제발";
		newAry[1] = "매너좀";
		
		System.out.println("원본 배열 : "+Arrays.toString(oldAry));
		System.out.println("복사 배열 : "+Arrays.toString(newAry));
	}
}
