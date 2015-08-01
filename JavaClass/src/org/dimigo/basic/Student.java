/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *        |_Student 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 17.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Student {
	private int gisu;
	private int grade;
	private int ban;
	private int number;
	private String name;
	private String address;
	private String phone;
	
	public Student(){
	}
		public Student (int gisu, int grade, int ban, int number, 
								String name, String address, String phone) {
		
			this.gisu = gisu;
			this.grade = grade;
			this.ban = ban;
			this.number = number;
			this.name = name;
			this.address = address;
			this.phone = phone;
		}
		public Student (int gisu, int grade, int ban, int number, 
				String name, String address) {
			this(gisu, grade, ban, number, name, address, "휴대폰번호 없음");
}
		public Student (int gisu, int grade, int ban, int number, String name) {
			this(gisu, grade, ban, number, name, "주소 없음");
			}
		public Student (int gisu, int grade, int ban, int number) {
			this(gisu, grade, ban, number, "이름 없음");
			}
		public void printStudent(){
			System.out.println("<<학번 정보 출력>>");
			System.out.println("1. 학번 : " + gisu + grade + ban + String.format("%02d", number));
			System.out.println("2. 이름 : " + name);
			System.out.println("3. 주소 : " + address);
			System.out.println("4. 휴대폰 번호 : " + phone);
		}
		public int getGisu(){
			return gisu;
		}
		public int getGrade(){
			return grade;
		}
		public int getBan(){
			return ban;
		}
		public int getNumber(){
			return number;
		}
		public String getName(){
			return name;
		}
		public String getAddress(){
			return address;
		}
		public String getPhone(){
			return phone;
		}
		/**
		 * @param gisu the gisu to set
		 */
		public void setGisu(int gisu) {
			this.gisu = gisu;
		}
		/**
		 * @param grade the grade to set
		 */
		public void setGrade(int grade) {
			this.grade = grade;
		}
		/**
		 * @param ban the ban to set
		 */
		public void setBan(int ban) {
			this.ban = ban;
		}
		/**
		 * @param number the number to set
		 */
		public void setNumber(int number) {
			this.number = number;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @param address the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}
		/**
		 * @param phone the phone to set
		 */
		public void setPhone(String phone) {
			this.phone = phone;
		}

}

