package java231011;

import java.util.Scanner;

public class java231011_05 {
	 public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         String grade;
         int score;

         System.out.println("Enter your grade.\nex) 1grade");
         grade = s.next();

         System.out.println("Enter your midterm score.");
         score = s.nextInt();

         if(score >= 60){
                 if(grade.equals("4grade")){
                         if(score >= 70)
                                 System.out.println("Pass");
                         else if(score < 70)
                                 System.out.println("Fail.");
                 }else
                      	System.out.println("Pass.");
         }else if(score < 60)
                 System.out.println("Fail.");
         else if(score < 0 && score > 100)
                 System.out.println("Enter your score correctly.");

         s.close();
	 }
}
