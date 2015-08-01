/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_Car
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 12.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Car {
	
	//public static String company;
	// 인스턴스 필드
	private String name;
	// 정적 필드 
	private static String company;
	
	public Car(String name){
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Car.company = company;
	}
	
//	public void printCar(){
//		System.out.println(company + " , " + name);
//	}
	
	//1. 인스턴스 메소드에서 인스턴스 필드와 static 필드 호출하기
//	public void printCar(){
//		System.out.println(name + ", " + Car.company);
//		System.out.println(this.name + ", " + company);
//	}
	//2. 인스턴스 메소드에서 인스턴스 메소드와 static 메소드 호출하기
//	public void printCar(){
//		System.out.println(getName() + ", " + getCompany());
//	}
//	
	//3. static 메소드에서 인스턴스 필드와 static 필드 호출하기
	public static void printCar3(Car car){
		System.out.println(car.name + ", " + company);
	}
	//4. static 메소드에서 인스턴스 메소드와 static 메소드 호출하기
	public static void printCar4(Car car){
		System.out.println(car.getName() + ", " + getCompany());
	}
}