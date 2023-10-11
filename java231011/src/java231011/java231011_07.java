package java231011;

import java.util.Scanner;

public class java231011_07 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        int month;

        System.out.println("Enter monthes.\nex) 1~12");
        month = s.nextInt();
        
        if((month >= 3) && (month <= 5))
        	System.out.println("Spring");
        else if((month >= 6) && (month <= 8))
        	System.out.println("Summer");
        else if((month >= 9) && (month <=
        		11))
        	System.out.println("Fall");
        else if((month == 1) || (month == 2) || (month == 12))
        	System.out.println("Winter");

        s.close();
}
}
