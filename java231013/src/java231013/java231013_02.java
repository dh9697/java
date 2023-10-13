package java231013;

public class java231013_02 {
	public static void main(String[] args) {
		for(int i = 10; i>=1; i--) {
			if(i%2 == 0 && i == 2)
				System.out.print(i+".");
			else if(i%2 == 0)
				System.out.print(i+", ");
		}
	}
}
