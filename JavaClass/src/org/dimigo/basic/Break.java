package org.dimigo.basic;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu;
		//무한루프로 변경(break문 사용)
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("<<게임메뉴>>");
			System.out.println("1. 공격");
			System.out.println("2. 수비");
			System.out.println("3. 종료");
			System.out.println("---------------------------------------");
			System.out.print("메뉴 입력 ->");
			
			menu = scanner.nextInt();
			if(menu == 3){
				System.out.println("게임 종료");
				scanner.close();
				break;
			}
			switch(menu){
			case 1:
				System.out.println("김현성을 공격하라");
				break;
			case 2:
				System.out.println("배주웅을 공격하라");
				break;
				
			default:
					System.out.println("없는 메뉴 입니다");
					break;
					
			} 
			}while(menu != 3); 
	}
	}
