package org.dimigo.basic;

public class For {

	public static void main(String[] args) {
		//System.out.println("<<번호 출력 하기>>");
		//for(int i = 1; i<=37; i++){
		//	System.out.println(i + "번");
		//	if(i % 10 == 0) System.out.println();
		
//		System.out.println("<<구구단 출력 하기>>");
//		for(int i = 2; i<=9; i++){
//			for(int j = 1; j<=9; j++){
//			System.out.print(i + " * " + j +" = " + i * j + "\t");
//		}
//			System.out.println();
//		}
		int[] intArr = {10,20,30};
		
		for(int i=0; i<3; i++){
			System.out.println(intArr[i]);
		
		}
		for(int value : intArr){
			System.out.println(value);
		}
		System.out.println("<< 무한도전 멤버 >>");
		String[] member = {"유재석", "정중앙", "박명수", "하하", "정형돈"};
		for(String name : member){
		System.out.println(name);
		}
		}

}
