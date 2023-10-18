package personal;

import java.util.Scanner;
import java.util.Arrays;

public class personal01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Hello.");
		System.out.println("Do you like playing LOL?\t(y/n)");
		String yOrn = s.next();
		
		if(yOrn.equals("y")) { 
			System.out.println("Where is your line?\t(top/jg/mid/ad/sp)");
			for(int i = 0; i<6; i++) {
				for (int j = 0; j < 12; j++) {
					if (i == 0 || i == 5) {
	                    System.out.print("*");
					} else if(i==1 && (j==0 || j==9 || j==11)){
						System.out.print("*");
					} else if(i==2 && (j==0 || j==7 || j==11)){
						System.out.print("*");
					} else if(i==3 && (j==0 || j==5 || j==11)) {
						System.out.print("*");
					} else if(i==4 && (j==0 || j==3 || j==11)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}		
			String line = s.next();
		}else if(yOrn.equals("n"))
			System.out.println("Please Say y..");
		
		String[] top = {"¿À¸¥"};
	}
}