package java231011;

import java.util.Scanner;

public class java231011_10 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int dbScore, ecsScore, osScore, dcScore, sfeScore;
//
		System.out.println("Enter a score of DB, Electronic calculator structrue, OS, Date communication, software engineering.");
		dbScore = s.nextInt();
		ecsScore = s.nextInt();
		osScore = s.nextInt();
		dcScore = s.nextInt();
		sfeScore = s.nextInt();
//
//		int[] scoreArray = {dbScore, ecsScore, osScore, dcScore, sfeScore};
//
//		int sum = 0;
//
//		for(int i = 0; i < scoreArray.length; i++){
//			sum += scoreArray[i];
//		}
//		
//		if(sum >= 60){
//			if(scoreArray[i] < 8)
//				System.out.println("Fail.");
//			System.out.println("Pass.");
//		}else
//			System.out.println("Fail.");
//
		int score = dbScore + ecsScore + osScore + dcScore + sfeScore;
		
		if(score < 60 || dbScore < 8 || ecsScore < 8 || osScore < 8 || dcScore < 8 || sfeScore < 8)
			System.out.println("Fail.");
		else
			System.out.println("Pass.");
		
		s.close();
	}
}
