package org.dimigo.basic;

public class Switch {

	public static void main(String[] args) {
		//주사위 번호 뽑기 (1~6)
//		int i;
//		
//		for(i= 0; i<10; i++) {
//			
//			double d = Math.random();
//			
//			System.out.println(d);
//			
//		int ramdom = (int)(d * 6); // 0~5
//		System.out.println(ramdom + 1); // 1~6
//		}
		int num = (int) (Math.random() * 6) + 1;
		
		switch(num % 2){
		case 0:
		System.out.println("짝수 입니다.");
		break;
		case 1:
		System.out.println("홀수 입니다.");
		break;
		default:
			System.out.println("넌 누구냐!!!");
			
		}
		String season = "봄";
		
		switch (season){
		case "봄":
			System.out.println("따뜻하네요");
			break;
		case "여름":
			System.out.println("더워요");
			break;
		case "가을":
			System.out.println("선선해요");
			break;
		case "겨울":
			System.out.println("추워요");
			break;
		default:
			System.out.println("넌 누구냐");
		}
		
		
	}
}
