/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *        |_Car
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 6.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Car {
	private String company;
	private String model;
	private String colur;
	private int maxSpeed;
	private int Price;
	
	public void forward(){
			System.out.println("전진 합니다.");
		}
	public void backward(){
		System.out.println("후진 합니다");
	}			
	public boolean stop(){
		System.out.println("정차 합니다");
		return true;
	}
	public void turnLeft(){
		System.out.println("좌회전 합니다.");
	}
	public void turnRight(){
		System.out.println("우회전 합니다.");
	}
}


