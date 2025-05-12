package scheduling;
import java.util.*;
public class ClassSchedule 
{
	String scheduled;
	String term;
	String department;
	ArrayList<Course> courses;
	
	public ClassSchedule(String scheduled, String term, String department, ArrayList<Course> courses) 
	{
		
		this.scheduled = scheduled;
		this.term = term;
		this.department = department;
		this.courses = courses;
	}

	public String getScheduled() {
		return scheduled;
	}

	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}

	public String getTerm() {
		return term;
	}

	
	public String getDepartment() {
		return department;
	}

	
	public ArrayList<Course> getCourses() {
		return courses;
	}

	
	
	
}
