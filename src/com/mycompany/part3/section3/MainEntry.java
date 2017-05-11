/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author green
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Person p1, p2;
		Teacher t = new TeacherImpl("Ilker", "java");
		Student s = new StudentImpl("Alex", "java");
		p1 = t;
		p2 = s;
		System.out.printf("p1 name: %s p1 name: %s%n", p1.getName(), p2.getName());

	}

}
