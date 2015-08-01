/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *        |_PersonTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 26.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("아이유", 22, 162, 44);
		p.eat();
		p.sleep();
		System.out.println();
		
		Student s = new Student("이승현", 18, 176, 62, "2526");
		
		s.eat();
		s.sleep();
		s.study();
		s.eatsnack();
		System.out.println();
	
		Teacher t = new Teacher("조혜연", 31, 162, 49, "정보통신");
		
		t.eat();
		t.eat();
		t.teach();
		t.doTask();
		t.sleep();
		System.out.println();
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(t);
		
		
	}

}
