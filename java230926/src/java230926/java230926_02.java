package java230926;

import java.util.Scanner;

public class java230926_02 {
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double n1, n2;
		double resAdd;
		double resSub;
		double resMul;
		double resDiv;
		double resRes;
		
		System.out.println("���� �ϳ� �Է�");
		n1 = s.nextDouble();
		System.out.println(n1+"����");
		System.out.println("���� �ϳ� �� �Է�");
		n2 = s.nextDouble();
		System.out.println(n2+"����");
		
		resAdd = n1 + n2;
		resSub = n1 - n2;
		resMul = n1 * n2;
		resDiv = (double) n1 / n2 ;
		resRes = n1 % n2;
		
		System.out.println("����ߵ�!");
		System.out.println("Add :"+resAdd);
		System.out.println("Sub :"+resSub);
		System.out.println("Mul :"+resMul);
		System.out.println("Div :"+resDiv);
		System.out.println("Res :"+resRes);
		
		s.close();
	}
}
