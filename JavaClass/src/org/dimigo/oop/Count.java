/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_Count
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 11.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Count {
	private static int count;
	
	public Count(){
		count++;
	}
	public static int getCount(){
		return count;
	}

}
