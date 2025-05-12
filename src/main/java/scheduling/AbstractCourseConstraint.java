package scheduling;
import java.util.*;
public abstract class AbstractCourseConstraint 
{
	String constraintID;
	String constraintName;
	Department department;
	ArrayList <Course> courses;
	
	public AbstractCourseConstraint(String constraintID, String constraintName, Department department) {
		
		this.constraintID = constraintID;
		this.constraintName = constraintName;
		this.department = department;
	}
	
	
	public void addCourse(Course course)
	{
		courses.add(course);
	}
	
	public void removeCourse(Course course)
	{
		courses.remove(course);
	}
	
	public abstract boolean isSatisfied();
	
}
