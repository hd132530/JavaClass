/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *        |_StringMethod
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class StringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//			   01234567890123
		String s = "abcdefgABCDEFG";
		System.out.println(s.length()); 		//14
		System.out.println(s.substring(3)); 	//defgABCDEFG
		System.out.println(s.substring(3, 6)); //def
		System.out.println(s.indexOf("C"));	//9
		System.out.println(s.charAt(7));		//A
		System.out.println(s.concat("ABC")); //abcdefgABCDEFGABC
		System.out.println("[" + "       ABC       ".trim() + "]"); //[ABC]
		System.out.println(s.toUpperCase()); //ABCDEFGABCDEFG
		System.out.println(s.toLowerCase()); //abcdefgabcdefg
		System.out.println(s.replace('a', 'A')); //AbcdefgABCDEFG
		System.out.println(s.startsWith("abc")); //true
		System.out.println(s.endsWith("EFG")); //true
	}

}
