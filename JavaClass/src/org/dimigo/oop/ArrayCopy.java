/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_ArrayCopy
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 29.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class ArrayCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intSrc = {1,2,3,4,5};
		int[] intDest = new int[10];
		
		// intSrc -> intDest에 복사해서 넣기
		
//		for(int i=0; i<intSrc.length; i++){
//			intDest[i] = intSrc[i];
//		}
		System.arraycopy(intSrc, 0, intDest, 0, intSrc.length);
		for(int value : intDest){
			System.out.println(value);
		}
		String[] strSrc = {"Taker", "UnderTaker", "메이웨더", "파퀴아오"};
		String[] strDest = new String[10];
		
		System.arraycopy(strSrc, 0, strDest, 0, strSrc.length);
		for(String value : strDest){
			System.out.println(value);
		}
	}

}
