/**
 * 
 */
package org.dimigo.basic;
/**
 * <pre>
 * org.dimigo.basic
 *        |_Book
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 10.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Book {
	private String title;
	private String author;
	private int page = 1000;
	
	public Book(){
		System.out.println("기본생성자");
	}
	public Book(String newTitle, String newAuthor, int newPage){
		//System.out.println("3개 생성자");
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}	
	public int getPage(){
		return page;
	}
	public void setTitle(String newTitle){
		title = newTitle;
	}
	public void setAuthor(String newAuthor){
		author = newAuthor;
	}
	public void setPage(int newPage){
		if(newPage > 0)
		page = newPage;
	}
}
