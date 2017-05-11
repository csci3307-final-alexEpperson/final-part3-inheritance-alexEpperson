/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author green
 *
 */
public class TeacherImpl extends PersonBaseImpl implements Teacher, Person
{
	String thoughtCourseTitle;
	public TeacherImpl(String _name, String _thoughtCourseTitle)
	{
		super(_name);
		this.thoughtCourseTitle = _thoughtCourseTitle;
	}
	public String getDetails() 
	{
		return "Teacher";
	}

	public String teachesFor() {
		// TODO Auto-generated method stub
		return this.thoughtCourseTitle;
	}

}
