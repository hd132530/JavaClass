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
public class Calculator {

	private int num1;
	private int num2;
	private boolean powerFlag = false;
	
	public Calculator() {
	} 
	
	public Calculator(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void powerOn(){
		this.powerFlag = true;
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		this.powerFlag = false;
		System.out.println("전원을 끕니다.");
	}
	
	public int add(){
		if(!this.powerFlag)
			this.powerOn();
		return this.num1 + this.num2;
	}
	
	public int sub(){
		if(!this.powerFlag)
			this.powerOn();
		return this.num1 - this.num2;
	}

	public int mul(){
		if(!this.powerFlag)
			this.powerOn();
		return this.num1 * this.num2;
	}

	public double div(){
		if(!this.powerFlag)
			this.powerOn();
		return (double) this.num1 / this.num2;
	}	
}
