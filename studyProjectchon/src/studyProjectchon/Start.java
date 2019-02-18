package studyProjectchon;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		/*java.util.Scanner 클래스 
		Scanner는 단락 문자의 패턴을 사용해 입력을 토큰에 따라 
		분할하며 디폴트로 사용되는 단란 문자는 공백 문자이다.
		작성된 토큰은, 다양한 next 메서드를 사용해, 다른 형태의
		값으로 변환할 수 있다.
		*/	
			
		/*별표를 입력받아 ---  java.util.Scanner 클래스 활용
		 *내가 입력할때의 값은 숫자로 입력하겠지 그러면 그걸 통해서 반복을 통해 별을 만들어야 한다.   
		 *별(오각형)을 만든다.
		 *
		 */
		
/*		Scanner scanner = new Scanner(System.in);
		System.out.println("무언가를 입력하세요");
		int number  = scanner.nextInt();
		
		/*for(int i = 0 ; i<5; i++ ) {
			for(int j = 0; j<i; j++) {
				System.out.println("i의 값은 :"+i+ " j의 값은 :"+j+" 입니다.");
			}
			
		}
		
		System.out.println("오오");*/
		
		/*
		 * for(초기화; 조건식 ; 증감식) {
		 * "조건식이 true일  실행될 실행문"
		 * }
		 */
		
		 //위에 삼각형 
		 Scanner scan =  new Scanner(System.in);
		 System.out.println("숫자를 입력하세요");
		 int x = scan.nextInt();
		 if(x==1) {
			x = x+9;
		 }else if(x==2){
			 x =x +7;
		 }else if(x==3) {
			 x= x+6;
		 }
		 for(int i = 0; i<x; i++) {	 
			 for(int e = 0; e<(x*2)-i; e++) {
				 System.out.print(" ");
			 }
			for(int j = 0; j<i*2+1; j++) {
				 System.out.print("*");
			}		 
			System.out.println();
		 }
			 
			// 중간 몸통
		 for(int s=0 ; s<x; s++) {
			 for(int el=0; el<s; el++) {
				 System.out.print(" ");
			 } 
			 for(int tl=0; tl<x*2-s; tl++) {
				 System.out.print("*");
			 } 
			 for(int tr=0; tr<(x*2)-s; tr++) {
				 System.out.print("*");
			 }
			 
			 if(s<x) {
				 System.out.println();
			 }
		
		 }	
 
		 for(int b=0; b<x; b++) {
			 for(int el=0; el<x-b; el++) {
				 System.out.print(" ");
			 }
			 for(int bl=0; bl<(x+1)-b; bl++) {
				 System.out.print("*");
			 }
			 
			 for(int er=0; er<(b*4); er++) {
				 System.out.print(" ");
			 }
			 for(int br=0; br<(x+1)-b; br++) {
				 System.out.print("*");
			 }		
			 System.out.println(); 
		 }	 	
		}
}
