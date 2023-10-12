package java231012;

import java.util.Scanner;

public class java231012_09 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter two numbers.");
        num1 = s.nextInt();
        num2 = s.nextInt();

        if(num1 < 1 || num2 < 1)
                System.out.println("Enter a number greater than 1.");
        else if(num1 < num2){
                for(int i=num1; i<num2+1; i++){
                        System.out.println(i);
                }
        }else if(num1 > num2){
                for(int i=num2; i<num1+1; i++){
                        System.out.println(i);
                }
        }

        s.close();
	}
}
