package test;

public class JavaTest3 {
	public static void main(String[] args) {
		int number1 = 10, number2 = 20;
		int resAdd;
		int resSub;
		int resMul;
//		int resDiv;
		
		resAdd = number1 + number2;
		resSub = number1 - number2;
		resMul = number1 * number2;
//		resDiv = number1 / number2;
		
		System.out.println(number1+"+"+number2+"="+resAdd);
		System.out.println(number1+"-"+number2+"="+resSub);
		System.out.println(number1+"*"+number2+"="+resMul);
//		System.out.println(number1+"/"+number2+"="+resDiv);
		
		double resDiv;
		resDiv = (double) number1 / number2;
		System.out.println(resDiv);
		//int = integral 실수
		
		// 변수명은 영어와 숫자 둘다 가능, 같이도 가능하지만 영어가 먼저 와야함
		// 언더바 사용 가능
		// 소문자와 대문자는 다름
		// 변수명은 소문자로 클래스명은 대문자로 시작 권장
		}
}
