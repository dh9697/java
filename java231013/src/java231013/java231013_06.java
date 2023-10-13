package java231013;

public class java231013_06 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 100; i>=1; i-=3) {
			sum += i;
			if(i == 1)
				System.out.println(i+"=");
			else
				System.out.print(i+"+");
		}
		System.out.println("sum = "+sum);
	}
}
