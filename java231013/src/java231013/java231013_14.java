package java231013;

import java.util.Scanner;

public class java231013_14 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("Enter a number.");
        num = s.nextInt();

        int dan = 0;
        System.out.println("[ "+num+"dan ]");

        for(int i=1; i<=9; i++){
                for(int k=2; k<=9; k++){
                        dan = num*i;
                }
                System.out.println(num+" x "+i+" = "+dan);
        }
        
        s.close();
	}
}
