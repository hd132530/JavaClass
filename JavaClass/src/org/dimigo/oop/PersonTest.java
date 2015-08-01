/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_PersonTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 19.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("박찬진", 18, "19980921", "O형");
		Person p2 = new Person("김정현", 18, "19981102", "O형");
		
		System.out.println(p1.toString());
		System.out.println(p2);
		
		// Person.TYPE = "asdf";
		
	}

}