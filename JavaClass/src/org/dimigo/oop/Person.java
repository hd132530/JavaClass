/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_Person
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 19.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Person {

	private String name;
	private int age;
	
	//final 필드
	private final String birthDt;
	private final String bloodType;
	private static final String type = "mammals";		// 선언과 동시에 초기화
	// 자바에서의 상수는 static final 로 만든다.
	
	public static final String TYPE = "mammals";
	
	public Person(String name, int age, String birthDt, String bloodType) {
		super();
		this.name = name;
		this.age = age;
		this.birthDt = birthDt;
		this.bloodType = bloodType;		// 생성자를 이용한 초기화
	}
	//객체의 내용을 문자열로 만들어 리턴해주는 메소드
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birthDt = " + birthDt
				+ ", bloodType=" + bloodType + ", type=" + type + "]";
	}
}
