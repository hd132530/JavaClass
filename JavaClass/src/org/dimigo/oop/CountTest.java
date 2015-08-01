/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_CountTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 11.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class CountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			new Count();
			System.out.println(Count.getCount());
		}

	}

}
