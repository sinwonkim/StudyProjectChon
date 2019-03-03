package studyRpg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Charactor {
	int Hp,Att,Shd,Lv,Exp,nExp,Hp2;
	String name;
		
	public Charactor(String n) {
		name = n;
		Lv = 1;
		Exp = 0;
		nExp = 200;
		Hp = 800;
		Hp2 = 800;
		Att = 25;
		Shd = 5;
	}
		
		String gN(){
		return name;
		}
		int gAp(){
		return Att;
		}
		int gHp(){
		return Hp;
		}
		int gHp2() { 
		return Hp2;
		}
		int gSd() {
		return Shd;
		}
		int gLv(){
		return Lv;
		}
		int gEp() {
		return Exp;
		}
		int gNEp(){
		return nExp;
		}
		void gstatus(){
		System.out.println("이름 : "+name);
		System.out.println("레벨 : "+Lv);
		System.out.println("Hp : "+Hp);
		System.out.println("공격 : "+Att);
		System.out.println("방어 : "+Shd);
		System.out.println("경험치 : "+Exp);
		System.out.println("NExP : "+nExp);
		System.out.println("=====================");
		}
	}


 	class Monster {
 		
	int Hp,Lv,Exp,Att,Shd,Hp2;
	String name;
	
	public Monster(String n,int h, int a , int s, int e) {
	name = n;
	Hp = h;
	Hp2 = h;
	Lv = 1;
	Exp = e;
	Att = a;
	Shd = s;
	}
	String gN() {
	return name;
	}
	
	int gLv(){
	return Lv;
	}
	
	int gHp() {
	return Hp;
	}
	
	int gHp2(){
	return Hp2;
	}
	
	int gEp(){
	return Exp;
	}
	
	int gAp() {
	return Att;
	}
	
	int gSd() {
	return Shd;
	}
}
 	
 	public class GameMain {
 		public static void main(String[] args)throws IOException {
 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 			String name;
 			int uact,cact,mnum,atack,shild;
 			System.out.print("케릭터의 이름을 입력해주세요 : ");
 			name  = br.readLine();

 			Charactor c = new Charactor(name);
 			Monster m[] = new Monster[6];
 			m[1] = new Monster("개",100,10,2,15);
 			m[2] = new Monster("고양이",50,25,10,30);
 			m[3] = new Monster("사자",300,30,15,50);
 			m[4] = new Monster("호랑이",200,70,30,100);
 			m[5] = new Monster("말",500,2,20,40);
 			
 			while(true){
 				System.out.println("===================");
 				System.out.println(c.gN()+"무엇을 하신건가요?");
 				System.out.println("1.휴식");
 				System.out.println("2.장소 이동");
 				System.out.println("3.현 상태 확인");
 				System.out.println("4.종료");
 				uact = Integer.parseInt(br.readLine());
 				switch(uact){
 				case 1:
 				System.out.println("===================");
 				System.out.println("휴식을 취합니다.");
 				System.out.println("체력이 회복되었습니다.");
 				System.out.println("현재 체력 :"+c.gHp2());
 				c.Hp = c.Hp2;
 				break;

 				case 2:
 				System.out.println("=======================");
 				System.out.println("어디로 이동할까요?");
 				System.out.println("1.사냥터");
 				System.out.println("2.마을");
 			
 				uact = Integer.parseInt(br.readLine());
 				switch(uact){
 				case 1:
 				System.out.println("================");
 				System.out.println("무엇을 할까요?");
 				System.out.println("1.사냥");
 				System.out.println("2.그만(마을로 이동)");
 				uact =  Integer.parseInt(br.readLine());
 				}
 			}
 		}
 	}
 }
