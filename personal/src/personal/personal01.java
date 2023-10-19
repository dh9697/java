package personal;

import java.util.Scanner;
import java.util.Arrays;


public class personal01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Hello.");
		System.out.println("Do you like playing LOL?\t(y/n)");
		String yOrn = s.next();
		String line;
		
		if(yOrn.equals("y")) { 
			System.out.println("Where is your line?\t(top/jg/mid/ad/sp)");
			for(int i = 0; i<6; i++) {
				for (int j = 0; j < 12; j++) {
					if (i == 0 || i == 5) {
	                    System.out.print("*");
					} else if(i==1 && (j==0 || j==9 || j==11)){
						System.out.print("*");
					} else if(i==2 && (j==0 || j==7 || j==11)){
						System.out.print("*");
					} else if(i==3 && (j==0 || j==5 || j==11)) {
						System.out.print("*");
					} else if(i==4 && (j==0 || j==3 || j==11)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}		
			line = s.next();
			
			String[] top = {"����","�ǿ���","�϶����","�ٸ��콺","��Ʈ�Ͻ�","������Ʈ","�轺","�̷�����","��Ʈ","�ǻ�","����","����","����","����","���� �ڻ�","��������","���̽�","����","�丯","��","Ƽ��","����","�츣��","����","Ʈ����","����","�׶󰡽�"};
			String[] jg = {"ī����","����","����","�׷��̺���","ī����","����","�̺�","Ż����","��¥��","���־ƴ�","���ֳ̾�","��ī��","�ƹ���","���ٳ�","���ӽ�","����ī��","�ǵ齺ƽ","����","������","�ϴ޸�","���̹�","�񿡰�","����","Ų�巹��","������"};
			String[] mid= {"�����Ƴ�","���Ϸ���","���","���Ǹ�","����","���丣","����","��ũ��","��Į��","Ż��","�Ƹ�","����","�߽���","����","�ƿ췼���� ��","����","ī���","ī�ÿ����","������","�ִϺ��","���׿�","���̰�","�����","īŸ����","������"};
			String[] ad = {"�����","¡ũ��","ī�̻�","��","����Ʋ��","�ú�","�ֽ�","�巹�̺�","����","�Ҷ�","����","�̽� ����","Į����Ÿ","��þ�","Ʈ��ġ","�ٷ罺","Ʈ����Ÿ��","����","�ڱ׸�","�ھ�","��̶�"};
			String[] sp = {"������","����ũ��ũ","��ĭ","�˸���Ÿ","����","����","����","����ũ","��ƿ����","��","�Ҷ�ī","����","�𸣰���","���̶�","�ٵ�","������","ī����","����","�и���","���","������","Ÿ��","�ܳ�","������","����","����Ÿ �۶�ũ"};
			
			double random1 = Math.random();
			double random2 = Math.random();
			
			switch(line) {
			case "top": 
				for(int i = 0; i<top.length; i++) {
					System.out.println((i+1)+". "+top[i]);
				}
				System.out.println("Which of the following is your champion?");
				int topPick = (int)Math.round(random1*(top.length-1));
				System.out.println("Your pick: "+top[topPick]);
				int topEnemy = (int)Math.round(random2*(top.length-1));
				System.out.println("enenmy: "+top[topEnemy]);
				break;
			case "jg": 
				for(int i = 0; i<jg.length; i++) {
					System.out.println((i+1)+". "+jg[i]);
				}
				System.out.println("Which of the following is your champion?");
				int jgPick = (int)Math.round(random1*(jg.length-1));
				System.out.println("Your pick: "+jg[jgPick]);
				int jgEnemy = (int)Math.round(random2*(jg.length-1));
				System.out.println("enenmy: "+jg[jgEnemy]);
				break;
			case "mid":
				for(int i = 0; i<mid.length; i++) {
					System.out.println((i+1)+". "+mid[i]);
				}
				System.out.println("Which of the following is your champion?");
				int midPick = (int)Math.round(random1*(mid.length-1));
				System.out.println("Your pick: "+mid[midPick]);
				int midEnemy = (int)Math.round(random2*(mid.length-1));
				System.out.println("enenmy: "+mid[midEnemy]);
				break;
			case "ad": 
				for(int i = 0; i<ad.length; i++) {
					System.out.println((i+1)+". "+ad[i]);
				}
				System.out.println("Which of the following is your champion?");
				int adPick = (int)Math.round(random1*(ad.length-1));
				System.out.println("Your pick: "+ad[adPick]);
				int adEnemy = (int)Math.round(random2*(ad.length-1));
				System.out.println("enenmy: "+ad[adEnemy]);
				break;
			case "sp": 
				for(int i = 0; i<sp.length; i++) {
					System.out.println((i+1)+". "+sp[i]);
				}
				System.out.println("Which of the following is your champion?");
				int spPick = (int)Math.round(random1*(sp.length-1));
				System.out.println("Your pick: "+sp[spPick]);
				int spEnemy = (int)Math.round(random2*(sp.length-1));
				System.out.println("enenmy: "+sp[spEnemy]);
				break;
			}
		}else if(yOrn.equals("n"))
			System.out.println("Please Say y..");
		else
			System.out.println("Enter y or n.");
		
		System.out.println("Let's fight!");

	}
}