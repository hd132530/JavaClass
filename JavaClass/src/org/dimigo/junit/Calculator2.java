/**
 * 
 */
package org.dimigo.junit;

/**
 * <pre>
 * org.dimigo.oop
 *        |_Calculator
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015/06/05
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Calculator2 {
/******************** 인스턴스 필드 ***************/
//	private int num1;
//	private int num2;
	private boolean powerFlag = false;
	/******** 정적 (static) 필드***************/
	public static double PI = 3.141592;
	
	public Calculator2() {
	} 
	
//	public Calculator2(int num1, int num2){
//		this.num1 = num1;
//		this.num2 = num2;
//	}
	/*********인스턴스 메소드**********/
	public void powerOn(){
		if(!powerFlag) {
			this.powerFlag = true;
		System.out.println("전원을 켭니다.");
		}
	}
	
	public void powerOff() {
		this.powerFlag = false;
		System.out.println("전원을 끕니다.");
	}
	/*********정적 메소드**********/
	public static int add(int num1, int num2){
//		if(!this.powerFlag)
//			this.powerOn();
		return num1 + num2;
		
	}
	
	public static int sub(int num1, int num2){
//		if(!this.powerFlag)
//			this.powerOn();
		return num1 - num2;
	}

	public static int mul(int num1, int num2){
//		if(!this.powerFlag)
//			this.powerOn();
		return num1 * num2;
	}

	public static double div(int num1, int num2){
//		if(!this.powerFlag)
//			this.powerOn();
		return (double) num1 / num2;
	}
	public static double add(double num1, double num2){
		return num1 + num2;
		
	}
	
	public static double sub(double num1, double num2){
		return num1 - num2;
	}

	public static double mul(double num1, double num2){
		return num1 * num2;
	}

	public static double div(double num1, double num2){
		return (double) num1 / num2;
	}

//power를 먼저 켜지 위한 메소드 오버로딩
		public static int add(int num1, int num2, Calculator2 c){
//			if(!this.powerFlag)
			c.powerOn();
			return num1 + num2;
			
		}
		
		public static int sub(int num1, int num2, Calculator2 c) {
//			if(!this.powerFlag)
			c.powerOn();
			return num1 - num2;
		}

		public static int mul(int num1, int num2, Calculator2 c) {
//			if(!this.powerFlag)
			c.powerOn();
			return num1 * num2;
		}

		public static double div(int num1, int num2, Calculator2 c) {
//			if(!this.powerFlag)
			c.powerOn();
			return (double) num1 / num2;
	}	
}
