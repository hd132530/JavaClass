/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_CarTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 12.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Car.company = "현대";
		Car.setCompany("현대");
		Car[] cars= {
				new Car("아반떼"), new Car("투싼"), new Car("싼타페")
		};
		for (Car car : cars){
			Car.printCar4(car);
		}
		System.out.println("\n\n");
	
		Car.setCompany("기아");
		for(Car car : cars){
			Car.printCar4(car);
		}
		System.out.println();
		
		Car.setCompany("현대");
		for(Car car : cars){
			Car.printCar4(car);
			//car.printCar();
		}
		System.out.println();
		
		for (Car car : cars) {
			car.printCar3(car);
			car.printCar4(car);
		}
		System.out.println(Math.PI);
		System.out.println(Math.abs(-123));
//		System.out.println(Math.);
	}

	
}
