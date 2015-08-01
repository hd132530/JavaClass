/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *        |_Teacher
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 26.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Teacher extends Person{
	private String subject;

	public Teacher(String name, int age, int height, int weight, String subject) {
		super(name, age, weight, height);
//		this.name = name;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
		this.subject = subject;
	}
	public void teach(){
		System.out.println(getName() + "쌤이 공부를 가르친다.");
	}
	public void doTask(){
		System.out.println(getName() + "쌤이 업무를 본다.");
	}
	
	public String toString() {
		return super.toString() + "Teacher [Teacher=" + subject + "]";
	}
	
	
}