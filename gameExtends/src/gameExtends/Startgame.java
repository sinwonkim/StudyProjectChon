package gameExtends;

import java.util.Scanner;

public class Startgame {
	static int current;
	static int index = -1; // 케릭터 번호
	static int gameOption; // 1.케릭터 생성 3.게임종료
	static int playOption; // 사냥할 던전 선택 1.고블린 던전 2.오크부족 3.골렘사원
	static int characterAction; // 1.공격하기 2.스킬사용
	static int huntingGround; // 사냥할 던전 선택
	static String name; // 사용자에게 입력받아서 저장할 이름
	static int upgradeJob; // 전직 1.전사 2.궁수
	static int check = 0; // 스타트
	
	// 음악
	
	
	// static String changeCha; //나중에 케릭변경 추가해볼 용도
	static Scanner scanner;
	static CreateCharactor[] charactor;
	
	public static void main(String[] args) {
		charactor = new CreateCharactor[10];
		scanner = new Scanner(System.in);

		while (check == 0) {
			Startgame.startMenu(); // 케릭터 생성 메소드

			while (true) {

				play(charactor);

				if (playOption == 1) {

					System.out.println("=======이동하실 사냥터를 선택해 주세요========");
					System.out.println("1. 정글 ");
					System.out.println("2. 드래곤의 협곡");
					System.out.println("3. 용의 협곡");
					huntingGround = scanner.nextInt();

					if (huntingGround == 1) {
						Monster monster = new Monster("붉은덩굴정령", 5, 10, 20);// manme,hp,att,exp 추후 턴어라운드방식 같은거 구현해보자
						fight(monster);

					} else if (huntingGround == 2) {
						Monster monster = new Monster("드래곤", 12, 10, 30);
						fight(monster);

					} else if (huntingGround == 3) {
						Monster monster = new Monster("내셔남작", 20, 8, 50);
						fight(monster);
					} else if (gameOption == 2) {} // 케릭터 변경시 추가할 사항
						
				}

			}
		}
		scanner.close();
	}
	
	// 케릭터 생성 메소드
	static void startMenu() {
		System.out.println("======== 메 뉴 ========");
		System.out.println("1. 케릭터 생성");
		System.out.println("3. 게임 종료");
		gameOption = scanner.nextInt();

		if (gameOption == 1) {
			System.out.println("케릭터 명을 입력 해 주세요 : ");
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
		} else if (gameOption == 2) { // 2.케릭터 바꿀떄
		} else if (gameOption == 3) { // 3.게임 종료
			System.out.println("게임이 종료 됩니다.");
			return;
		}
	}

	static void play(CreateCharactor[] charactor) {
		scanner = new Scanner(System.in);

		System.out.println("=====현재 캐릭터=====");
		System.out.println("캐릭명 : " + charactor[current].name);
		System.out.println("직업명 : " + charactor[current].job);
		System.out.println("level : " + charactor[current].level);
		System.out.println("공격력 : " + charactor[current].att);
		System.out.println("mp : " + charactor[current].mp);
		System.out.println("레벨업 까지 필요 경험치: " + charactor[current].needExp+"Exp");
		System.out.println("현재 경험치 : " + charactor[current].totalExp+"Exp");
		System.out.println("스킬 데미지 : " + charactor[current].skillDamage);
		System.out.println();
		System.out.println("1. 몬스터 사냥");
	/*	System.out.println("2. 전직");*/
		System.out.println("3. 초기화면으로 돌아가기");	
		String selectPick = scanner.nextLine();
		selectPick.trim();
		playOption = Integer.parseInt(selectPick);
		
	}

	static void fight(Monster monster) {
		scanner = new Scanner(System.in);
		while (monster.hp > 0) {
			// hp가 0이 될떄까지 반복
			if(charactor[current].job.equals("모험가")) {
				System.out.println("★ ★ ★  ★ ★ ★ ★ ★ ★★ ★ ★  ★ ★ ★ ★ ★ ★");
				System.out.println("=====전투중인 몬스터 정보====");
				System.out.println("이름 :" + monster.name + "\n" + "남은체력 : " + monster.hp + "\n");
				System.out.println("1.공격하기");
			}else if(charactor[current].job.equals("전사")) {
				System.out.println("=====전투중인 몬스터 정보====");
				System.out.println("이름 :" + monster.name + "\n" + "남은체력 : " + monster.hp + "\n");
				System.out.println("1.공격하기");
				System.out.println("2.파워어택");	
			}else if(charactor[current].job.equals("궁수")) {
				System.out.println("=====전투중인 몬스터 정보====");
				System.out.println("이름 :" + monster.name + "\n" + "남은체력 : " + monster.hp + "\n");
				System.out.println("1.공격하기");
				System.out.println("2.집중사격");	
			}
			characterAction = scanner.nextInt();
			if (characterAction == 1) //일반 공격
				charactor[index].attack(monster);
			if(charactor[index].mp > 0) {
				if (characterAction == 2)
					charactor[index].skill(monster);
			}
			if(charactor[index].checkUpgrade == 1) { // 스킬사용
				if(charactor[index].mp <= 0) {
				   System.out.println("★ ★ ★  ★ ★ ★ ★ ★ ★★ ★ ★  ★ ★ ★ ★ ★ ★ ");	
				   System.out.println("★★★★★★★★★마나가 부족 합니다★★★★★★★★");
				   System.out.println("★ ★ ★  ★ ★ ★ ★ ★ ★★ ★ ★  ★ ★ ★ ★ ★ ★ ");
				   System.out.println("마나를 회복 하시겠습니까?");
				   System.out.println("1.회복한다.");
				    int check = scanner.nextInt();
				    if(check == 1) {
				    	charactor[index].start();
				    }
			    }
		    }
		}
		System.out.println("몬스터를 죽였습니다.");
		charactor[index].levelUp(monster.exp); // return 경험치 넘겨줌
		System.out.println();
		
		if (charactor[index].checkUpgrade == 0) { //전직하면 1이됨 
			if (charactor[index].level >= 5) {
				System.out.println("축하합니다. 전직을 할 수 있게 되었습니다.");
				System.out.println("=====전직 목록===== ");
				System.out.println("1.야스오");
				System.out.println("2.베인");
				int upgradeJob = scanner.nextInt();
				System.out.println("당신이 선택한 전직 루트는 " + upgradeJob + "번 입니다");
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
						System.out.println("잘못된 전직을 하셨습니다.");
				}
	
			  }
	   } 
	}
}
