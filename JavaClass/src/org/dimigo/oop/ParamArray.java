/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_ParamArray
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 28.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class ParamArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		ParamArray obj = new ParamArray();
		obj.plus(intArr);
		for(int value : intArr){
			System.out.println(value);
		}
		
		String[] strArr = {"홍길동", "홍길서", "홍길남", "홍길복"};
		obj.changeName(strArr);
		for(String value : strArr) {
			System.out.println(value);
		}
	}
	private void plus(int[] arr) {
	for (int i=0; i<arr.length; i++) {
		arr[i]++;
			}
		}
	private void changeName(String[] arr){
		for (int i=0; i<arr.length; i++){
			arr[i] = arr[i].substring(1);
			
		}
	}
}

