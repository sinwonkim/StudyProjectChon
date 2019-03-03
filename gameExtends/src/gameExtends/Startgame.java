package gameExtends;

import java.util.Scanner;

public class Startgame {
	static int current;
	static int index = -1; // �ɸ��� ��ȣ
	static int gameOption; // 1.�ɸ��� ���� 3.��������
	static int playOption; // ����� ���� ���� 1.��� ���� 2.��ũ���� 3.�񷽻��
	static int characterAction; // 1.�����ϱ� 2.��ų���
	static int huntingGround; // ����� ���� ����
	static String name; // ����ڿ��� �Է¹޾Ƽ� ������ �̸�
	static int upgradeJob; // ���� 1.���� 2.�ü�
	static int check = 0; // ��ŸƮ
	
	// ����
	
	
	// static String changeCha; //���߿� �ɸ����� �߰��غ� �뵵
	static Scanner scanner;
	static CreateCharactor[] charactor;
	
	public static void main(String[] args) {
		charactor = new CreateCharactor[10];
		scanner = new Scanner(System.in);

		while (check == 0) {
			Startgame.startMenu(); // �ɸ��� ���� �޼ҵ�

			while (true) {

				play(charactor);

				if (playOption == 1) {

					System.out.println("=======�̵��Ͻ� ����͸� ������ �ּ���========");
					System.out.println("1. ���� ");
					System.out.println("2. �巡���� ����");
					System.out.println("3. ���� ����");
					huntingGround = scanner.nextInt();

					if (huntingGround == 1) {
						Monster monster = new Monster("������������", 5, 10, 20);// manme,hp,att,exp ���� �Ͼ������ ������ �����غ���
						fight(monster);

					} else if (huntingGround == 2) {
						Monster monster = new Monster("�巡��", 12, 10, 30);
						fight(monster);

					} else if (huntingGround == 3) {
						Monster monster = new Monster("���ų���", 20, 8, 50);
						fight(monster);
					} else if (gameOption == 2) {} // �ɸ��� ����� �߰��� ����
						
				}

			}
		}
		scanner.close();
	}
	
	// �ɸ��� ���� �޼ҵ�
	static void startMenu() {
		System.out.println("======== �� �� ========");
		System.out.println("1. �ɸ��� ����");
		System.out.println("3. ���� ����");
		gameOption = scanner.nextInt();

		if (gameOption == 1) {
			System.out.println("�ɸ��� ���� �Է� �� �ּ��� : ");
			name = scanner.next();

			for (int i = 0; i < charactor.length; i++) {
				if (name.equals(String.valueOf(charactor[i])))
					continue;
				else {
					charactor[++index] = new CreateCharactor(name);
					current = i;
					break;
				}
			}
		} else if (gameOption == 2) { // 2.�ɸ��� �ٲ܋�
		} else if (gameOption == 3) { // 3.���� ����
			System.out.println("������ ���� �˴ϴ�.");
			return;
		}
	}

	static void play(CreateCharactor[] charactor) {
		scanner = new Scanner(System.in);

		System.out.println("=====���� ĳ����=====");
		System.out.println("ĳ���� : " + charactor[current].name);
		System.out.println("������ : " + charactor[current].job);
		System.out.println("level : " + charactor[current].level);
		System.out.println("���ݷ� : " + charactor[current].att);
		System.out.println("mp : " + charactor[current].mp);
		System.out.println("������ ���� �ʿ� ����ġ: " + charactor[current].needExp+"Exp");
		System.out.println("���� ����ġ : " + charactor[current].totalExp+"Exp");
		System.out.println("��ų ������ : " + charactor[current].skillDamage);
		System.out.println();
		System.out.println("1. ���� ���");
	/*	System.out.println("2. ����");*/
		System.out.println("3. �ʱ�ȭ������ ���ư���");	
		String selectPick = scanner.nextLine();
		selectPick.trim();
		playOption = Integer.parseInt(selectPick);
		
	}

	static void fight(Monster monster) {
		scanner = new Scanner(System.in);
		while (monster.hp > 0) {
			// hp�� 0�� �ɋ����� �ݺ�
			if(charactor[current].job.equals("���谡")) {
				System.out.println("�� �� ��  �� �� �� �� �� �ڡ� �� ��  �� �� �� �� �� ��");
				System.out.println("=====�������� ���� ����====");
				System.out.println("�̸� :" + monster.name + "\n" + "����ü�� : " + monster.hp + "\n");
				System.out.println("1.�����ϱ�");
			}else if(charactor[current].job.equals("����")) {
				System.out.println("=====�������� ���� ����====");
				System.out.println("�̸� :" + monster.name + "\n" + "����ü�� : " + monster.hp + "\n");
				System.out.println("1.�����ϱ�");
				System.out.println("2.�Ŀ�����");	
			}else if(charactor[current].job.equals("�ü�")) {
				System.out.println("=====�������� ���� ����====");
				System.out.println("�̸� :" + monster.name + "\n" + "����ü�� : " + monster.hp + "\n");
				System.out.println("1.�����ϱ�");
				System.out.println("2.���߻��");	
			}
			characterAction = scanner.nextInt();
			if (characterAction == 1) //�Ϲ� ����
				charactor[index].attack(monster);
			if(charactor[index].mp > 0) {
				if (characterAction == 2)
					charactor[index].skill(monster);
			}
			if(charactor[index].checkUpgrade == 1) { // ��ų���
				if(charactor[index].mp <= 0) {
				   System.out.println("�� �� ��  �� �� �� �� �� �ڡ� �� ��  �� �� �� �� �� �� ");	
				   System.out.println("�ڡڡڡڡڡڡڡڡڸ����� ���� �մϴ١ڡڡڡڡڡڡڡ�");
				   System.out.println("�� �� ��  �� �� �� �� �� �ڡ� �� ��  �� �� �� �� �� �� ");
				   System.out.println("������ ȸ�� �Ͻðڽ��ϱ�?");
				   System.out.println("1.ȸ���Ѵ�.");
				    int check = scanner.nextInt();
				    if(check == 1) {
				    	charactor[index].start();
				    }
			    }
		    }
		}
		System.out.println("���͸� �׿����ϴ�.");
		charactor[index].levelUp(monster.exp); // return ����ġ �Ѱ���
		System.out.println();
		
		if (charactor[index].checkUpgrade == 0) { //�����ϸ� 1�̵� 
			if (charactor[index].level >= 5) {
				System.out.println("�����մϴ�. ������ �� �� �ְ� �Ǿ����ϴ�.");
				System.out.println("=====���� ���===== ");
				System.out.println("1.�߽���");
				System.out.println("2.����");
				int upgradeJob = scanner.nextInt();
				System.out.println("����� ������ ���� ��Ʈ�� " + upgradeJob + "�� �Դϴ�");
				boolean flag = true;
				while (flag) {
					if (upgradeJob == 1) {
						
						Yasuo warrior = new Yasuo(name);
						warrior.Basic(charactor[index]);
						warrior.skill(charactor[index]);
						flag = false;
					} else if (upgradeJob == 2) {
						
						Vein archer = new Vein(name);
						archer.Basic(charactor[index]);
						archer.skill(charactor[index]);
						flag = false;
					} else
						System.out.println("�߸��� ������ �ϼ̽��ϴ�.");
				}
	
			  }
	   } 
	}
}
