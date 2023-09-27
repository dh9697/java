package test;

public class hello1 {
	public static void main (String[] args) {
		System.out.println("실행문");		
/* 실행문은 변수 선언, 변수값 저장, 메소드 호출에 해당하는 코드
 * 실행문 끝에는 반드시 세미콜론 (;)을 붙여 실행문의 끝 표시 */
		// 변수 선언
		int x; 
		// 변수 x에 1 값을 저장
		x = 1; 
		//변수 y를 선언하고 2 값 저장
		int y = 2; 
		//변수 result를 선언하고 변수 x와 y를 더한 값 저장
		int result = x + y; 
		// 콘솔에 변수의 값을 출력하는 println()메소드 호출
		System.out.println(result);  
	}
}
