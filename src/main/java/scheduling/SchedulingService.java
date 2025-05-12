package scheduling;

import java.util.*;

public class SchedulingService 
{
	private Map<String, User> users = new HashMap<>();
	private Map<String, Course> courses = new HashMap<>();
	DataStore data;
	
	private List<AbstractCourseConstraint> globalConstraints = new ArrayList<>();
	
	public void addUser(User user) 
	{
		users.put(user.getId(), user);
	}
	
	public void addCourse(Course course)
	{
		courses.put(course.getCourseId(), course);
	}
	public void addContraint(AbstractCourseConstraint constraint)
	{
		globalConstraints.add(constraint);
	}
	
	public void markProposedScheduleComplete(ProposedSchedule schedule)
	{
		schedule.complete = true;
	}
	
	public Course searchClasses(String query)
	{
		ArrayList<Course> courseList = data.getCourses();
		for (Course course : courseList)
		{
			boolean strcmp = query.equals(course.getCourseName());
			if (strcmp == true)
			{
				return course; // this is how course search works
			}
		}
		return null;
	}
	
	public boolean verifyPermission(User editor, Department dept) //the one editing the file
	{ // all can view file so permissions don't matter
		if (editor.getUserType().equals("chair") || (editor.getUserType().equals("admin"))) // this is only checked for changing department courses on this sprint
			
		{
			return true;
		}
		return false;
	}
	
	public boolean checkInterProgramConflict(ProposedSchedule)
	{
		
		
	}
}
