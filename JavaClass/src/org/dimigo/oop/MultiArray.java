/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_MultiArray
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 21.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class MultiArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		//이차원 배열 생성하기
		int [][] intArr = new int[2][3];
//		
//		for(int i = 0; i<intArr.length; i++)
//		{
//			for(int j = 0; j<intArr.length; j++)
//				System.out.println(intArr[i][j] + " | ");
//			System.out.println();
//		}
//		System.out.println("");
//		
//		for(int[]value : intArr){
//			System.out.println(value + " | ");
//				for(int[]value1 : intArr){
//					System.out.println(value1 + " | ");
//			} 
//			System.out.println("");
//		}
//		intArr[0][0] = 100;
//		intArr[1][2] = 90;
//		intArr[1][3] = 80;
//		int [] test = new int [3];
//		
//		for(int value : test) {
//			
//		}
//		for(int[] arr)
//		System.out.println();
//		String[][] strArr = new String[2][];
//		strArr[0] = new String[3];
//		strArr[1] = new String[2];
//		for(String[] arr : strArr){
//			for(String value : arr){
//				System.out.print(value + " | ");
//			}
//			System.out.println();
//		}
//		strArr[0][0] = "C";
//		strArr[0][1] = "Java";
//		strArr[0][2] = "C++";
//		
//		strArr[1][0] = "PHP";
//		strArr[1][1] = "JSP";

		
//		for(String[] arr : strArr){
//			for(String value : arr){
//				System.out.print(value + " | ");
//			}
//			System.out.println();
//		}
		String[][] strArr = new String[2][];
		strArr[0] = new String[]{"C", "JAVA", "C++"};
		strArr[1] = new String[]{"PHP", "JSP"};
		for(String[] arr : strArr){
			for(String value : arr){
				System.out.print(value + " | ");
			}
			System.out.println();
		}

		
	}

}
