/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *        |_Student
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 26.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Student extends Person{
	
	private String studentid;

	public Student(String name, int age, int height, int weight,	String studentid) {
		super(name, age, height, weight);
		//		this.name = name;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
		this.studentid = studentid;
	}
	public void study(){
		System.out.println(getName() + "이/가 공부를 한다.");
	}
	public void eatsnack(){
		System.out.println(getName() + "이/가 간식을 먹는다.");
	}
	public String toString() {
		return super.toString() + "Student [studentid=" + studentid + "]";
	}
}
