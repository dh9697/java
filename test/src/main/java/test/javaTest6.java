package test;

import java.util.Scanner;

public class javaTest6{
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요. ##");
    System.out.print("받는 사람 :");
    String str1 = s.next();
    
    System.out.print("주소 :");
    String str2 = s.next();
    
    System.out.print("무게(g) :");
    double num1 = s.nextDouble();
    
    System.out.println("배송비 2500(원)을 입력하세요");
    int num2 =s.nextInt();
    
    System.out.println("Total :");
    System.out.println("받는 사람==>"+str1);
    System.out.println("주소 ==>"+str2);
    System.out.println("무게 ==>"+num1+"g");
    System.out.println("배송비==>"+num2+"원");
    
    s.close();
}
}