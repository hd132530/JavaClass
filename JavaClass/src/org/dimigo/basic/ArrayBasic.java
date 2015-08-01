/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *        |_ArrayBasic
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class ArrayBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//배열선언
		int[] intArr = null;
		
		intArr = new int[5];
		for(int value : intArr){
			System.out.print(value + " | ");
		}
		System.out.println();
		//배열 선언과 생성을 동시에 하기
		String[] strArr = new String[3];
		strArr[0] = "EXO";
		strArr[1] = "EXID";
		for (String value : strArr){
			System.out.print(value + " | ");
		}
		System.out.println();
		
		//길이가 3인 Book 타입 배열 생성하기	
		Book[] bookArr = new Book[3];
		bookArr[0] = new Book("파피용", "베르나르 베르베르", 1000);
		bookArr[1] = new Book("파피용", "베르나르 베르베르", 1000);
		bookArr[2] = new Book("파피용", "베르나르 베르베르", 1000);
		
		
		for(Book value : bookArr)
		{
			System.out.print(value.getTitle() + " | ");
		}
		System.out.println();
	}

}
