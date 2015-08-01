/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_SingletonTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 18.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
	}

}
