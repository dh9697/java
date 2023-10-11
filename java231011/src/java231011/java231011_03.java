package java231011;

import java.util.Scanner;

public class java231011_03 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("Enter a number.");
        num = s.nextInt();

        if(num >= 50)
                System.out.println("A number is greater than 50");
        else if(num < 50)
                System.out.println("A number is less than 50");

        s.close();
	}
}
