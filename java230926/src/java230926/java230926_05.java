package java230926;

import java.util.Scanner;

public class java230926_05 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// �� ������� 0���� �ʱ�ȭ
		int total = 0;
				
		// ������ ���̳ʽ� ���� �� ����׿��� ����
		String buyItem1, buyItem2;
		int buyPrice1, buyPrice2, buyNum1, buyNum2;
		
		System.out.println("���� ǰ��� ����, ������ ���ʷ� �����ּ���.");
		buyItem1 = s.next();
		buyPrice1 = s.nextInt();
		buyNum1 = s.nextInt();
		System.out.println("���� ǰ��: "+buyItem1+", ���� ����: " + buyPrice1 + "��, "+"���� ����: " + buyNum1 + "��");	
		System.out.println("���� ���ݰ� ������ ���ʷ� �����ּ���.");
		buyItem2 = s.next();
		buyPrice2 = s.nextInt();
		buyNum2 = s.nextInt();
		System.out.println("���� ǰ��: "+buyItem2+", ���� ����: " + buyPrice2 + "��, "+"���� ����: " + buyNum2 + "��");
		total -= buyNum1 * buyPrice1 + buyPrice2 * buyNum2;
		System.out.println("�� �ݾ���"+total+" ���Դϴ�.");
		
		// �Ǹ��� �÷��� ���� �� ����׿� ���ϱ�
		String sellItem1, sellItem2, sellItem3, sellItem4, sellItem5;
		int sellPrice1, sellPrice2, sellPrice3, sellPrice4, sellPrice5;
		int sellNum1, sellNum2, sellNum3, sellNum4, sellNum5;
		
		System.out.println("�Ǹ� ǰ��� ����, ������ ���ʷ� �����ּ���.");
		sellItem1 = s.next();
		sellPrice1 = s.nextInt();
		sellNum1 = s.nextInt();
		System.out.println("�Ǹ� ǰ��: "+ sellItem1 + ", �Ǹ� ����: "+sellPrice1+"��, "+sellNum1+"��");
		sellItem2 = s.next();
		sellPrice2 = s.nextInt();
		sellNum2 = s.nextInt();
		System.out.println("�Ǹ� ǰ��: "+ sellItem2 + ", �Ǹ� ����: "+sellPrice2+"��, "+sellNum2+"��");
		sellItem3 = s.next();
		sellPrice3 = s.nextInt();
		sellNum3 = s.nextInt();
		System.out.println("�Ǹ� ǰ��: "+ sellItem3 + ", �Ǹ� ����: "+sellPrice3+"��, "+sellNum3+"��");
		sellItem4 = s.next();
		sellPrice4 = s.nextInt();
		sellNum4 = s.nextInt();
		System.out.println("�Ǹ� ǰ��: "+ sellItem4 + ", �Ǹ� ����: "+sellPrice4+"��, "+sellNum4+"��");
		sellItem5 = s.next();
		sellPrice5 = s.nextInt();
		sellNum5 = s.nextInt();
		System.out.println("�Ǹ� ǰ��: "+ sellItem5 + ", �Ǹ� ����: "+sellPrice5+"��, "+sellNum5+"��");
		
		total += sellPrice1*sellNum1+sellPrice2*sellNum2+sellPrice3*sellNum3+sellPrice4*sellNum4+sellPrice5*sellNum5;
		System.out.println("���� �� ������� "+total+" ���Դϴ�.");
		
		s.close();
		
	}
}
