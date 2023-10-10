package java231010;

import java.util.Scanner;

public class java231010_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int mid, fin, ass, att;
		
		System.out.println("Please enter midterm exam score.");
		mid = s.nextInt();
		
		System.out.println("Please enter final exam score.");
		fin = s.nextInt();
		
		System.out.println("Please enter assignment score.");
		ass = s.nextInt();
		
		System.out.println("Please enter number of attendance.");
		att = s.nextInt();
		
		System.out.println("midterm exam score: "+mid);
		System.out.println("final exam score: "+fin);
		System.out.println("assignment score: "+ass);
		System.out.println("number of attendance: "+att);
		
		System.out.println("\n==========RESULT==========\n");
		
		double totalScore = (mid*0.2)+(fin*0.3)+(ass*0.3)+att;
		
		System.out.println("midterm exam score(20): "+(mid*0.2));
		System.out.println("final exam score(30): "+(fin*0.3));
		System.out.println("assignment score(30): "+(ass*0.3));
		System.out.println("attendance score(20): "+att);
		
		System.out.println("Total score: "+ totalScore);
		
		if(totalScore >= 70) 
			System.out.println("Pass.");
			else if(att >= 20*0.3)
				System.out.println("Fail[Insufficient attendance("+att+"/20)]");
			else if(totalScore < 70) {
				System.out.println("Fail[Not enough score]");
		}
		
		s.close();
	}
}
