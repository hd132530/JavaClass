/**
 * 
 */
package org.dimigo.junit;

/**
 * <pre>
 * org.dimigo.oop
 *        |_CalculatorTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015/06/05
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class CalculatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		Calculator a = new Calculator(num1, num2);
		
		a.powerOn();
		
		System.out.println(num1 + " + "+ num2 + " = " + a.add());
		System.out.println(num1 + " - "+ num2 + " = " + a.sub());
		System.out.println(num1 + " * "+ num2 + " = " + a.mul());
		System.out.println(num1 + " / "+ num2 + " = " + a.div());
		
		a.powerOff();
		
	}

}
