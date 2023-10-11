package java231011;

import java.util.Scanner;

public class java231011_04 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("Enter a number.");
        num = s.nextInt();

        if(num%3 == 0)
                System.out.println("It's a multiple of 3.");
        else
            	System.out.println("It's not a multiple of 3.");

        s.close();
    }	
}

