/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *        |_ArrayBasic2
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 15.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class ArrayBasic2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		int[] intArr1 = new int[]{1,2,3,4,5};
		
		for(int value : intArr){
			System.out.print(value + " | ");
		}
		System.out.println();
		
		String[] strArr = {"ClariS", "머라이어 캐리", "queen"};
		String[] strArr1 =new String[] {"ClariS", "머라이어 캐리", "queen"};
		for(String value : strArr){
			System.out.print(value + " | ");
		}
		System.out.println();
		for(String value : strArr1){
			System.out.print(value + " | ");
		}
		System.out.println();
		
		//Book 타입 생성과 동시에 초기화
		Book[] bookArr = {new Book("미생", "윤태호", 1000),
								 new Book("자바의신", "나자바", 2000),
								 new Book("수학의 정석", "홍성대", 3000)
		};
		for(Book book : bookArr) {
			System.out.print(book.getTitle() + " | ");
		}
		System.out.println();
		
		String[] cities = null;
		
		cities = new String[] {"서울", "뉴욕", "파리"};
	
	}
	
}
