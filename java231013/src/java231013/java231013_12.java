package java231013;

import java.util.Scanner;

public class java231013_12 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("Enter a number.");
        num = s.nextInt();

        for(int i=0; i<num; i++){
                for(int k=num-1; k>=i; k--){
                        System.out.print(" ");
                }
                for(int k=0; k<num; i+=2){
                        System.out.print("*");
                }
                System.out.println("");
        }
        for(int i=0; i<num-1; i++){
                for(int k=0; k<num; k++){
                        System.out.print(" ");
                }
                for(int k=2*num-3; k>i; k--){
                        System.out.print("*");
                }
                System.out.println("");
        }

        s.close();
	}
}
