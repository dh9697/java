package java230927;

import java.util.Scanner;

public class java230927_01 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		// �� ����� �ʱ�ȭ
		int total = 0;
		
		// ���� �ݾ� �Է�
		System.out.println("���� ��ǰ�� �̸��� ����, ������ ���ʷ� �����ּ���.");		
		String bItem1, bItem2;
		int bPrice1, bPrice2, bNum1, bNum2;
		bItem1 = s.next();
		bPrice1 = s.nextInt();
		bNum1 = s.nextInt();
		System.out.println("���� ��ǰ: "+bItem1+", ���� ����: "+bPrice1+"��"+", ���� ����: "+bNum1+"��");
		
		System.out.println("���� ��ǰ�� �̸��� ����, ������ ���ʷ� �����ּ���.");
		bItem2 = s.next();
		bPrice2 = s.nextInt();
		bNum2 = s.nextInt();
		System.out.println("���� ��ǰ: "+bItem2+", ���� ����: "+bPrice2+"��"+", ���� ����: "+bNum2+"��");
		
		// ���� �ݾ��� ���� �� �����
		total -= bPrice1*bNum1 + bPrice2*bNum2;
		System.out.println("�� ������� "+total+"�� �Դϴ�.");
		
		// �Ǹ� �ݾ� �Է�
		System.out.println("�Ǹ� ��ǰ�� �̸��� ����, ������ ���ʷ� �����ּ���.");
		String sItem1, sItem2, sItem3, sItem4, sItem5;
		int sPrice1, sPrice2, sPrice3, sPrice4, sPrice5, sNum1, sNum2, sNum3, sNum4, sNum5;
		sItem1 = s.next();
		sPrice1 = s.nextInt();
		sNum1 = s.nextInt();
		System.out.println("�Ǹ� ��ǰ: "+sItem1+", �Ǹ� �ݾ�: "+sPrice1+"��"+", �Ǹ� ����: "+sNum1+"��");
		
		System.out.println("�Ǹ� ��ǰ�� �̸��� ����, ������ ���ʷ� �����ּ���.");
		sItem2 = s.next();
		sPrice2 = s.nextInt();
		sNum2 = s.nextInt();
		System.out.println("�Ǹ� ��ǰ: "+sItem2+", �Ǹ� �ݾ�: "+sPrice2+"��"+", �Ǹ� ����: "+sNum2+"��");
		
		System.out.println("�Ǹ� ��ǰ�� �̸��� ����, ������ ���ʷ� �����ּ���.");
		sItem3 = s.next();
		sPrice3 = s.nextInt();
		sNum3 = s.nextInt();
		System.out.println("�Ǹ� ��ǰ: "+sItem3+", �Ǹ� �ݾ�: "+sPrice3+"��"+", �Ǹ� ����: "+sNum3+"��");
		
		System.out.println("�Ǹ� ��ǰ�� �̸��� ����, ������ ���ʷ� �����ּ���.");
		sItem4 = s.next();
		sPrice4 = s.nextInt();
		sNum4 = s.nextInt();
		System.out.println("�Ǹ� ��ǰ: "+sItem4+", �Ǹ� �ݾ�: "+sPrice4+"��"+", �Ǹ� ����: "+sNum4+"��");
		
		System.out.println("�Ǹ� ��ǰ�� �̸��� ����, ������ ���ʷ� �����ּ���.");
		sItem5 = s.next();
		sPrice5 = s.nextInt();
		sNum5 = s.nextInt();
		System.out.println("�Ǹ� ��ǰ: "+sItem5+", �Ǹ� �ݾ�: "+sPrice5+"��"+", �Ǹ� ����: "+sNum5+"��");
		
		// �Ǹ� �ݾױ��� ���� �� �����
		total += sPrice1*sNum1 + sPrice2*sNum2 + sPrice3*sNum3 + sPrice4*sNum4 + sPrice5*sNum5;
		System.out.println("���� �ݾװ� �Ǹ� �ݾ��� ����� ������ �� ������� "+total+"���Դϴ�.");
		
		s.close();
	}
}
