/**
 * 
 */
package org.dimigo.oop;
//import java.lang.Math;

/**
 * <pre>
 * org.dimigo.oop
 *        |_Singleton
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 18.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Singleton {
		// 처음부터 아예 만들고 시작함
		private static Singleton instance = new Singleton();
		
		//외부 클래스에서 객체 생성 불가
		private Singleton(){
		
		}	
		//Therad-safe 하지 않음
		//필요한 시점에 메소드 호출로 객체 생성하기
		public static synchronized Singleton getInstance(){
			if(instance == null){
				instance = new Singleton();
			}
			return instance;
		}
		public static Singleton gerInstance2(){
			return instance;
		}
	}










