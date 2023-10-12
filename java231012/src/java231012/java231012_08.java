package java231012;

import java.util.Scanner;

public class java231012_08 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("Enter an integer.");
        num = s.nextInt();

        int sum = 0;
        for(int i=1; i<(num+1); i++){
                sum += i;
                if(i < num)
                        System.out.println(i+"+");
                else if(i == num)
                        System.out.println(i+"="+sum);
        }
        s.close();
	}
}
