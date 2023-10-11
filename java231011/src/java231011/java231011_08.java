package java231011;

import java.util.Scanner;

public class java231011_08 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int amount, menu;

        System.out.println("Enter the amount.");
        amount = s.nextInt();

        System.out.println("\tSelect a menu of number.");
        System.out.println("\t1. coke(800won) 2. water(500won) 3.vitaminWater(1500won) >>");
        menu = s.nextInt();

        if(menu == 1)
                menu = 800;
        else if(menu == 2)
                menu = 500;
        else if(menu == 3)
                menu = 1500;

        int changes = amount - menu;
        System.out.println("chages: "+changes);
        System.out.println("1000won to be refunded: "+(changes/1000));
        System.out.println("500won: "+(changes%1000)/500);
        System.out.println("100won: "+((changes%1000)%500)/100);

        s.close();
    }
}
