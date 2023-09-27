package java230927;

public class java230927_04 {
	public static void main(String[] args) {
		int java = 3, mobile = 2, excel = 1;
		double A = 4.5, A0 = 4.0, B = 3.5;
		
		double avg = ((java*B)+(mobile*A0)+(excel*A))/ (java+mobile+excel);
		System.out.println("평균 학점: "+avg);
		
		// 소수점 두자리까지 출력하기
		avg = Math.round(avg*100.0) / 100.0;
		System.out.print("평균 학점: "+avg);
	}
}
