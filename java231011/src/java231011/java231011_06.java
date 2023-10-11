package java231011;

import java.util.Scanner;

public class java231011_06 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Enter three numbers.");
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        int sum = num1 + num2 + num3;
        int avg = (num1 + num2 + num3)/3;

        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);

        s.close();
    }
}
