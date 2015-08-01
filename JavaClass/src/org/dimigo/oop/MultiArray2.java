/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_MultiArray2
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 28.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class MultiArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 이차원 배열 생성시 초기화 하기
		// 1. 중괄호만 두번 이용
		int [][] intArr = {
				{1,2,3,4},
				{5,6}
		};
		//초기화된 값을 출력해보자
		for(int [] arr : intArr){
			for(int value : arr){
			System.out.print(value);
			
			}
		System.out.println();
		}
		System.out.println();
		// 이하 생략
		// 2. 중괄호 + new 연산자 이용
		int[][] intArr2 = {
				new int[] {1,2,3,4},
				new int[] {5,6}
		};
		//이하 생략
		//3. new 연산자 + 중괄호이용 
		int [][] newArr3 = new int[][]{
				{1,2,3,4},
				{5,6}
		};
		//이하생략
		//4. ?
		int [][] newArr4 = new int[][]{
				new int[]{1,2,3,4},
				new int[]{5,6}
		}
		;
	}

}
