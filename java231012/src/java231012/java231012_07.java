package java231012;

import java.util.Scanner;

public class java231012_07 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("Enter a number.");
        num = s.nextInt();

        if(num < 1)
                System.out.println("Enter a number greater than 1.");
        else{
             	for(int i=0; i<num; i++){
                        System.out.println(num-i);
                }
        }
        s.close();
	}
}
