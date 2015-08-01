/**
 * 
 */
package org.dimigo.junit;
/**
 * <pre>
 * org.dimigo.oop
 *        |_CalculatorTest
 * 1. 개요 :
 * 2. 작성일 : 2015/06/05
 * </pre>
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class CalculatorTest2 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
//		Calculator a = new Calculator(num1, num2);
//		a.powerOn();
//		System.out.println(num1 + " + "+ num2 + " = " + a.add());
//		System.out.println(num1 + " - "+ num2 + " = " + a.sub());
//		System.out.println(num1 + " * "+ num2 + " = " + a.mul());
//		System.out.println(num1 + " / "+ num2 + " = " + a.div());
//		a.powerOff();
		Calculator2 calc = new Calculator2();
		 // 인스턴스 메소드 호출 (객체 생성)
		calc.powerOn();
		
		// 정적 메소드 호출
		
		System.out.println(num1 + " + "+ num2 + " = " + Calculator2.add(num1, num2));
		System.out.println(num1 + " - "+ num2 + " = " + Calculator2.sub(num1, num2));
		System.out.println(num1 + " * "+ num2 + " = " + Calculator2.mul(num1, num2));
		System.out.println(num1 + " / "+ num2 + " = " + Calculator2.div(num1, num2));
		
		//static 메소드 호출시 인스턴스 호출 방식으로도 수행은 되지만
		// 권장하는 방법은 아님 (반드시 클래스명.메소드명 호출)
		System.out.println(calc.add(10, 20));
		
		calc.powerOff();
		
		//power를 켜지않고 바로 연산을 했을때  power가 자동으로 켜지도록 해보자
		System.out.println("\n\n\n\n\n");
		System.out.println(num1 + " + "+ num2 + " = " + Calculator2.add(num1, num2, calc));
		System.out.println(num1 + " - "+ num2 + " = " + Calculator2.sub(num1, num2, calc));
		System.out.println(num1 + " * "+ num2 + " = " + Calculator2.mul(num1, num2, calc));
		System.out.println(num1 + " / "+ num2 + " = " + Calculator2.div(num1, num2, calc));
		calc.powerOff();
		
		double d1 = 1.2;
		double d2 = 2.4;
		
		System.out.println("\n\n\n\n\n");
		System.out.println(d1 + " + "+ d2 + " = " + Calculator2.add(d1, d2));
		System.out.println(d1 + " - "+ d2 + " = " + Calculator2.sub(d1, d2));
		System.out.println(d1 + " * "+ d2 + " = " + Calculator2.mul(d1, d2));
		System.out.println(d1 + " / "+ d2 + " = " + Calculator2.div(d1, d2));
		calc.powerOff();
		
		
	}
}