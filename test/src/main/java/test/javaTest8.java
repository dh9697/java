package test;

import java.util.Scanner;

public class javaTest8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id,password,check,name,gender,email;
		int phone;
		System.out.println("회원 가입 양식");
		System.out.println("아이디를 입력해주세요");
	    id = s.next();
		System.out.println("비밀번호를 입력해주세요");
	    password = s.next();
		System.out.println("비밀번호를 다시 입력해주세요");
		check = s.next();
		System.out.println("이름을 입력해주세요");
		name = s.next();
		System.out.println("성별을 입력해주세요");
		gender = s.next();
		System.out.println("전화번호를 입력해주세요");
		phone = s.nextInt();
		System.out.println("이메일을 입력해주세요");
		email = s.next();
		System.out.println("아이디 :"+id);
		System.out.println("비밀번호 :"+password);
		System.out.println("비밀번호 확인 :"+check);
		System.out.println("이름 :"+name);
		System.out.println("성별 :"+gender);
		System.out.println("전화번호 :"+phone);
		System.out.println("이메일 :"+email);
		
		s.close();
	}
}
