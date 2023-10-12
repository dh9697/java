package java231012;

import java.util.Scanner;

public class java231012_15 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("Enter a number.");
        num = s.nextInt();

        for(int i=0; i<num; i++){
                for(int k=0; k<i+1; k++){
                        System.out.print("*");
                }
                System.out.println("");
        }
        for(int i=0; i<num; i++){
                for(int j=num-1; j>i; j--){
                        System.out.print("*");
                }
                System.out.println("");
        }

        s.close();
	}	
}
