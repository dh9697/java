package java231018;

public class java231018_04 {
	public static void main(String[] args) {
		coffee myCoffee = new coffee();
		
		System.out.println("shop: "+myCoffee.shop);
		System.out.println("menu: "+myCoffee.menu);
		System.out.println("price: "+myCoffee.price+"��");
		System.out.println("temp: "+myCoffee.tem);
		
		myCoffee.tem = "hot";
		System.out.println("������ temp: "+myCoffee.tem);
	}
}
