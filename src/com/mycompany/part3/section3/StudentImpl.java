/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author green
 *
 */
public class StudentImpl extends PersonBaseImpl implements Student, Person
{
	String takenCourseTitle;
	public StudentImpl(String _name, String _takenCourseTitle)
	{
		super(_name);
		this.takenCourseTitle = _takenCourseTitle;
	}
	@Override
	public String getDetails() 
	{
		return "Student";
	}
	@Override
	public String studiesFor()
	{
		return this.takenCourseTitle;
	}
}
