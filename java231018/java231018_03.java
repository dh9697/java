package java231018;

class Car1{
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed = 0;
}

public class java231018_03 {
	public static void main(String[] args) {
//		TODO Auto-generated method stub
		Car1 myCar = new Car1();
		
//		Car ��ü�� �ʵ尪 �б�
		System.out.println("����ȸ��: "+myCar.company);
		System.out.println("�𵨸�: "+myCar.model);
		System.out.println("����: "+myCar.color);
		System.out.println("�ְ� �ӵ�: "+myCar.maxSpeed);
		System.out.println("���� �ӵ�: "+myCar.speed);
		
//		Car ��ü�� �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: "+myCar.speed);
	}
}
