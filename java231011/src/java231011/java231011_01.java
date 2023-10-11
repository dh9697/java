package java231011;

import java.util.Scanner;

public class java231011_01 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int hour, min, addMin;

        System.out.println("Enter hours: ");
        hour = s.nextInt();

        System.out.println("Enter minutes: ");
        min = s.nextInt();

        System.out.println("Enter additional minutes: ");
        addMin = s.nextInt();

        if(hour >= 0 && hour < 24){
                if(hour < 12){
                        if((addMin+min) < 60)
                                System.out.println(hour+":"+(min+addMin)+"AM");
                        else if((addMin+min) >= 60)
                                System.out.println((hour-12)+":"+(min+addMin)+"PM");
                }else if(hour >= 12){
                        if((addMin+min) >= 60){
                                if((hour+(min+addMin)/60) >= 24)
                                        System.out.println(((hour+(min+addMin)/60)-12)+":"+((min+addMin)%60)+"AM");
                                else if((hour+(min+addMin)/60) < 24)
                                        System.out.println(((hour+(min+addMin)/60)-12)+":"+((min+addMin)%60)+"PM");
                        }else if((addMin+min) < 60)
                                System.out.println((hour+(min+addMin)/60)+":"+(min+addMin)%60+"AM");

                }
        }else
             	System.out.println("0~23 hours only");

        s.close();
	}
}
