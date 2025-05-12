package scheduling;

import java.util.*;
public class ProposedSchedule 
{
	String scheduled;
	boolean complete = false;
	ArrayList<Course> courses;
	
	public ProposedSchedule(String scheduled, ArrayList<Course> courses) 
	{
		
		this.scheduled = scheduled;
		this.courses = courses;
	}
	
	public String getScheduled() 
	{
		return scheduled;
	}
	public void setScheduled(String scheduled) 
	{
		this.scheduled = scheduled;
	}
	public ArrayList<Course> getCourses() 
	{
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) 
	{
		this.courses = courses;
	}
	public void addCourse(Course course)
	{
		courses.add(course);
	}
	public void removeCourse(Course course)
	{
		courses.remove(course);
		
	}
}
