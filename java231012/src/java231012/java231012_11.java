package java231012;

import java.util.Scanner;

public class java231012_11 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("99dan, Enter a number.");
        num = s.nextInt();

        if(num >= 2 && num <= 9){
                int dan = 0;
                for(int i=num; i<=9; i++){
                        System.out.println("===== "+i+"dan =====");
                        for(int k=1; k<=9; k++){
                                dan = i*k;
                                System.out.println(i+" * "+k+" = "+dan);
                        }
                }

        }else
             	System.out.println("Enter a number between 2 and 9.");

        s.close();
	}
}
