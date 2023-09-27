package test;

public class JavaTest2 {
	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 100;
		num2 = 50;
		
		result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		
		result = num1 - num2;
		System.out.println(num1+"-"+num2+"="+result);
		
		result = num1 * num2;
		System.out.println(num1+"*"+num2+"="+result);
		
		result = num1 / num2;
		System.out.println(num1+"/"+num2+"="+result);
		
		result = num1 + num2 * num1 - 5 / num2;
		System.out.println(num1+"+"+num2+"*"+num1+"-"+5+"/"+num2+"="+result);
		
		// 변수에 문자열 대입
		// 문자열(string)에는 큰따옴표("")를 사용
		// 한 글자로 이루어진 문자(char)에는 작은따옴표('')를 사용
		String str1 = "김";
		String str2 = "다혜";
		System.out.println(str1);
		System.out.println(str2);
		String result2 = str1+str2;
		System.out.println(result2);
		
	}
}
