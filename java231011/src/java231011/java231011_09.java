package java231011;

import java.util.Scanner;

public class java231011_09 {
	 public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         int grade;

         System.out.println("Enter a grade score.");
         grade = s.nextInt();

         if(grade >= 60)
                 System.out.println("Pass.");
         else if(grade < 60)
                 System.out.println("Fail.");

         s.close();
 }
}
