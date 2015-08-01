/**
 * 
 */
package org.dimigo.oop;

import java.util.Arrays;

/**
 * <pre>
 * org.dimigo.oop
 *        |_CommandLine
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 1.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class CommandLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length !=2){
			System.out.println("프로그램 사용법");
			System.out.println("java CommandLine arg1 arg2");
			System.exit(0);
		}
		System.out.println(Arrays.toString(args));
		// 100 200 두인자를 넘겨받아 두개를 더한값을 출력해보자
		
//		Integer num1 = new Integer(100);
//		Integer num2 = new Integer(200);
//		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

}
