package java231012;

public class java231012_03 {
	public static void main(String[] args){
		int hap = 0;
        for(int i = 0; i<100; i++){
                if(i%4 == 0)
                        continue;
        hap += i;

        }
        System.out.println("1~100���� 4�� ����� �ƴ� ���ڵ��� ��: " + hap);
	}
}
