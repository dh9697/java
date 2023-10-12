package java231012;

public class java231012_04 {
	public static void main(String[] args){
        int i = 0;
        int num1, num2, num3;

        while(true){
                i++;

        num1 = (int)(Math.random()*6+1);
        num2 = (int)(Math.random()*6+1);
        num3 = (int)(Math.random()*6+1);

        if((num1 == num2) && (num2 == num3))
                break;
        }

        System.out.printf("Three dices is  all %d.", num1);
        System.out.printf("Throw %d once until the same number appear.", i);

	}
}
