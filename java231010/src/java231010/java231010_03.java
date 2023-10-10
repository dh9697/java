package java231010;

import java.util.Scanner;

public class java231010_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int krScore, mScore, eScore;
		
		System.out.println("Please enter your test score.\nKorean score : ");
		krScore = s.nextInt();
		
		System.out.println("Math score : ");
		mScore = s.nextInt();
		
		System.out.println("English score : ");
		eScore = s.nextInt();
		
		int total = krScore + mScore + eScore;
		int average = total/3;
		
		System.out.println("Total : "+total);
		System.out.println("Average : "+average);
		
		if(krScore >= 40 && mScore>= 40 && eScore >= 40 && average >= 60)
			System.out.println("Congratulations. You pass.");
		else
			System.out.println("You fail.");
		
		s.close();
	}
}
