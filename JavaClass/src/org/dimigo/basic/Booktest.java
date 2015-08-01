/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *        |_Booktest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 10.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Booktest{
	public static void min(String[] args) {
		Book book = new Book("미생", "윤태호", 1000);
		
		Book book2 = book;
		
		book2.setTitle("자바를 잡아라");
		
		System.out.println(book.getTitle());
		System.out.println(book2.getTitle());
	}
}

//public class Booktest {
//	
//		public static void main(String[] args) {
//			Book book = new Book("미생", "윤태호", 1000);
//			Book book2 = new Book("자바를 잡아라", "나자바");
//			
//			System.out.println("책제목 : "+book.getTitle());
//			System.out.println("작가 : "+book.getAuthor());
//			System.out.println("페이지수 : "+book.getPage());
//			
//			book.setTitle("자바를 잡아라!!!");
//			
//			System.out.println("책제목 : "+book.getTitle());
//			System.out.println("작가 : "+book2.getAuthor());
//			System.out.println("페이지수 : "+book2.getPage());
//		
//	}
//}
