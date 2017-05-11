/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author green
 *
 */
public abstract class PersonBaseImpl implements Person 
{
	/* (non-Javadoc)
	 * @see com.mycompany.part3.section3.Person#getName()
	 */
	protected String name;
	public void setName(String _name)
	{
		this.name = _name;
	}
	public PersonBaseImpl(String _name)
	{
		this.name = _name;
	}
	public String getName() 
	{
		return this.name;
	}
}
