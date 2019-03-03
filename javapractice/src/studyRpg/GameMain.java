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
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+Lv);
		System.out.println("Hp : "+Hp);
		System.out.println("���� : "+Att);
		System.out.println("��� : "+Shd);
		System.out.println("����ġ : "+Exp);
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
 			System.out.print("�ɸ����� �̸��� �Է����ּ��� : ");
 			name  = br.readLine();

 			Charactor c = new Charactor(name);
 			Monster m[] = new Monster[6];
 			m[1] = new Monster("��",100,10,2,15);
 			m[2] = new Monster("�����",50,25,10,30);
 			m[3] = new Monster("����",300,30,15,50);
 			m[4] = new Monster("ȣ����",200,70,30,100);
 			m[5] = new Monster("��",500,2,20,40);
 			
 			while(true){
 				System.out.println("===================");
 				System.out.println(c.gN()+"������ �ϽŰǰ���?");
 				System.out.println("1.�޽�");
 				System.out.println("2.��� �̵�");
 				System.out.println("3.�� ���� Ȯ��");
 				System.out.println("4.����");
 				uact = Integer.parseInt(br.readLine());
 				switch(uact){
 				case 1:
 				System.out.println("===================");
 				System.out.println("�޽��� ���մϴ�.");
 				System.out.println("ü���� ȸ���Ǿ����ϴ�.");
 				System.out.println("���� ü�� :"+c.gHp2());
 				c.Hp = c.Hp2;
 				break;

 				case 2:
 				System.out.println("=======================");
 				System.out.println("���� �̵��ұ��?");
 				System.out.println("1.�����");
 				System.out.println("2.����");
 			
 				uact = Integer.parseInt(br.readLine());
 				switch(uact){
 				case 1:
 				System.out.println("================");
 				System.out.println("������ �ұ��?");
 				System.out.println("1.���");
 				System.out.println("2.�׸�(������ �̵�)");
 				uact =  Integer.parseInt(br.readLine());
 				}
 			}
 		}
 	}
 }
