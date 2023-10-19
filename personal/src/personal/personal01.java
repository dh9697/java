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
			
			String[] top = {"오른","피오라","일라오이","다리우스","아트록스","말파이트","잭스","이렐리아","세트","뽀삐","가렌","럼블","나르","렝가","문도 박사","볼리베어","제이스","그웬","요릭","쉔","티모","워윅","우르곳","리븐","트런들","오공","그라가스"};
			String[] jg = {"카직스","리신","샤코","그레이브즈","카서스","녹턴","이블린","탈리야","신짜오","세주아니","다이애나","헤카림","아무무","쉬바나","람머스","마오카이","피들스틱","에코","릴리아","니달리","아이번","비에고","케인","킨드레드","렉사이"};
			String[] mid= {"오리아나","사일러스","요네","나피리","벡스","빅토르","니코","아크샨","아칼리","탈론","아리","피즈","야스오","제드","아우렐리온 솔","조이","카사딘","카시오페아","갈리오","애니비아","판테온","베이가","르블랑","카타리나","라이즈"};
			String[] ad = {"이즈리얼","징크스","카이사","진","케이틀린","시비르","애쉬","드레이븐","직스","닐라","베인","미스 포츈","칼리스타","루시안","트위치","바루스","트리스타나","제리","코그모","자야","사미라"};
			String[] sp = {"쓰레쉬","블리츠크랭크","라칸","알리스타","세나","제라스","럭스","파이크","노틸러스","렐","소라카","브라움","모르가나","자이라","바드","레오나","카르마","유미","밀리오","룰루","질리언","타릭","잔나","세라핀","나미","레나타 글라스크"};
			
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