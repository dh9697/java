package java231012;

import java.util.Scanner;

public class java231012_05 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int yNum,cNum;

        for(int i = 0; i<10; i++){
                cNum = (int)(Math.random()*5+1);
                System.out.printf("game %dst: ",i);
                System.out.printf("Computer's number? ");
                yNum = s.nextInt();
                if(cNum == yNum){
                        System.out.println("Correct!");
                        break;
                }else{
                      	System.out.printf("Sorry, %d! Try again!", cNum);
                        continue;
                }
        }

        System.out.println("Game over.");
        s.close();
	}
}
