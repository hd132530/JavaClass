/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *        |_BookSETest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 23.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class BookSETest {
	
	private void methodA(Book book) {
		book = new Book("자바를 잡아라!!", "나자바", 500);
		System.out.println(book.getTitle());
	}
	public static void main(String[] args) {
		Book book = new Book("미생", "윤태호", 1000);
		
		new BookSETest().methodA(book);
		System.out.println(book.getTitle());

	}

}
