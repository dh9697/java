package java230926;

import java.util.Scanner;

public class java230926_01 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("## ������ �̿��ÿ� ���Ű� ȯ���մϴ� ##");
		System.out.println("���� ���� �����Ծ�? yes or no");
		String str = s.next();
		System.out.println(str+"..");
		
		System.out.println("�� �ٵ� ���񴩳� ��� �� ���� �ؿ��?");
		int price = s.nextInt();
		System.out.println("��.."+price+".. ������� ������ �Դ´ٸ� ������!");		
		
		String str123 = "123";
		int x = Integer.parseInt(str123);
		double y = Double.parseDouble(str123);
		System.out.println(x);
		System.out.println(y);
		
		int num1, num2;
		int resAdd;
		int resSub;
		int resMul;
		double resDiv;
		int resRem;
		
		System.out.println("ù��° ����");
		num1 = s.nextInt();
		System.out.println("�ι�° ����");
		num2 = s.nextInt();
		
		resAdd = num1 + num2;
		resSub = num1 - num2;
		resMul = num1 * num2;
		resDiv = (double) num1 / num2 ;
		resRem = num1 % num2;
		
		System.out.println("Add :"+resAdd);
		System.out.println("Sub :"+resSub);
		System.out.println("Mul :"+resMul);
		System.out.println("Div :"+resDiv);
		System.out.println("Rem :"+resRem);
		
		s.close();
	}
}
