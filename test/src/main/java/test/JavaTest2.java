package test;

public class JavaTest2 {
	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 100;
		num2 = 50;
		
		result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		
		result = num1 - num2;
		System.out.println(num1+"-"+num2+"="+result);
		
		result = num1 * num2;
		System.out.println(num1+"*"+num2+"="+result);
		
		result = num1 / num2;
		System.out.println(num1+"/"+num2+"="+result);
		
		result = num1 + num2 * num1 - 5 / num2;
		System.out.println(num1+"+"+num2+"*"+num1+"-"+5+"/"+num2+"="+result);
		
		// ������ ���ڿ� ����
		// ���ڿ�(string)���� ū����ǥ("")�� ���
		// �� ���ڷ� �̷���� ����(char)���� ��������ǥ('')�� ���
		String str1 = "��";
		String str2 = "����";
		System.out.println(str1);
		System.out.println(str2);
		String result2 = str1+str2;
		System.out.println(result2);
		
	}
}
