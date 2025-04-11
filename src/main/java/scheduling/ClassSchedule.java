package scheduling;
import java.util.*;
public class ClassSchedule 
{
	String scheduled;
	String term;
	String department;
	ArrayList<Course> courses;
	
	public ClassSchedule(String scheduled, String term, String department, ArrayList<Course> courses) {
		
		this.scheduled = scheduled;
		this.term = term;
		this.department = department;
		this.courses = courses;
	}
	
	
	
}
