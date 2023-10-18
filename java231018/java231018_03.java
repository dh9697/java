package java231018;

class Car1{
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed = 0;
}

public class java231018_03 {
	public static void main(String[] args) {
//		TODO Auto-generated method stub
		Car1 myCar = new Car1();
		
//		Car 객체의 필드값 읽기
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색상: "+myCar.color);
		System.out.println("최고 속도: "+myCar.maxSpeed);
		System.out.println("현재 속도: "+myCar.speed);
		
//		Car 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);
	}
}
