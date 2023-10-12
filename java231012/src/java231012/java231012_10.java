package java231012;

import java.util.Scanner;

public class java231012_10 {
	public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         int num;

         System.out.println("99dan, Enter a number.");
         num = s.nextInt();

         int dan = 0;
         System.out.println("===== "+ num + "dan =====");
         for(int i =1; i<=9; i++){
                 dan = num*i;
                 System.out.println(num + " * " + i + " = " + (dan));
         }

         s.close();
	}
}
