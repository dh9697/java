package test;

import java.util.Scanner;

public class javaTest6{
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("## �ù� �������Դϴ�. ������ ���� �Է��ϼ���. ##");
    System.out.print("�޴� ��� :");
    String str1 = s.next();
    
    System.out.print("�ּ� :");
    String str2 = s.next();
    
    System.out.print("����(g) :");
    double num1 = s.nextDouble();
    
    System.out.println("��ۺ� 2500(��)�� �Է��ϼ���");
    int num2 =s.nextInt();
    
    System.out.println("Total :");
    System.out.println("�޴� ���==>"+str1);
    System.out.println("�ּ� ==>"+str2);
    System.out.println("���� ==>"+num1+"g");
    System.out.println("��ۺ�==>"+num2+"��");
    
    s.close();
}
}