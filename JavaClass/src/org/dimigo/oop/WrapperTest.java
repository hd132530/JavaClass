/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_WrapperTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 1.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class WrapperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Wrapper 클래스
		System.out.println(Integer.BYTES); //4
		System.out.println(Integer.SIZE); //4
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		
		Integer num1 = new Integer(1000);
		Integer num2 = new Integer(1000);
		
		if(num1 == num2){
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		if (num1.equals(num2)){
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}	
		// Boxing (Primitive -> Reference)
		Integer obj1= new Integer(1000);
		Double obj2 = new Double ("3.14");
		Integer obj5 = new Integer(2000);
		
		Integer obj3 = Integer.valueOf(2000);
		Double obj4 = Double.valueOf("3.14");
		
		//Unboxing (Reference -> Primitive)
		
		int i1 = obj1.intValue();
		double d1 = obj2.doubleValue();
		System.out.println(i1);
		System.out.println(d1);
		
		int i3 = obj3.intValue();
		double d4 = obj4.doubleValue();
		System.out.println(i3);
		System.out.println(d4);
		
		//문자열을 Primitive 타입으로 바꾸기
		int i2 = Integer.parseInt("12345");
		double d2 = Double.parseDouble("12.345");
		
		System.out.println(i2);
		System.out.println(d2);
		// Autoboxing과 Autounboxing이 총 몇번 수행되고 있는가?
		
		Integer result = obj1 + obj5;
		
		System.out.println(result);
		
	}

}
