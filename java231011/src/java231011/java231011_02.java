package java231011;

import java.util.Scanner;

public class java231011_02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        String membership;

        System.out.println("Membership: manager, member, nonMember");
        System.out.println("Membership level for which you wish to check permissions: ");
        membership = s.next();

        if(membership.equals("manager"))
                System.out.println("Member management, Post management, Post writing, Comment writing, Posr viewing");
        else if(membership.equals("member"))
                System.out.println("Post writing, Post viewing, Comment writing");
        else if(membership.equals("nonMember"))
                System.out.println("Post viewing");

        s.close();
}
}
