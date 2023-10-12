package java231012;

import java.util.Scanner;

public class java231012_02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

        int hap = 0;
        int num1, num2;

        while(true){
        	System.out.println("num1 ==> ");
        	num1 = s.nextInt();
        	if(num1 == 0)
        		break;
        	System.out.print("num2 ==> ");
        	num2 = s.nextInt();

        	hap = num1 + num2;
        	System.out.println(num1 + " + " + num2 + " = "+ hap);
        }

        System.out.println("Enter 0 to exit.");
        s.close();
	}
}
