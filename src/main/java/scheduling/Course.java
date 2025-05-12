package scheduling;
import java.util.*;
public class Course 
{
	String courseId;
	String courseName;
	String department;
	String instructor;
	ArrayList<String> crossListedCodes;
	String timeSlot;
	Room room;
	ArrayList<String> genEdTags;
	public Course(String courseId, String courseName, String department, String instructor,
			String timeSlot, Room room) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		this.department = department;
		this.instructor = instructor;
		this.crossListedCodes = new ArrayList<>();
		this.timeSlot = timeSlot;
		this.room = room;
		this.genEdTags = new ArrayList<>();
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public ArrayList<String> getCrossListedCodes() {
		return crossListedCodes;
	}
	public void addCrossListedCode(String crossCode)
	{
		crossListedCodes.add(crossCode);
	}
	

	public void setCrossListedCodes(ArrayList<String> crossListedCodes) {
		this.crossListedCodes = crossListedCodes;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public ArrayList<String> getGenEdTags() {
		return genEdTags;
	}
	public void addGenEdTags(String tag)
	{
		genEdTags.add(tag);
	}
	public void setGenEdTags(ArrayList<String> genEdTags) {
		this.genEdTags = genEdTags;
	}
	
}
