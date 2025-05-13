package scheduling;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchedulingServiceTest {
	Room R1;
	Room R2;
	User U1;
	User U2;
	User F1;
	User F2;
	Course C1;
	Course C2;
	
	String D0;
	String D1;
	String D2;
	String D3;
	
	String MWF0;
	String MWF1;
	String MWF2;
	String MWF3;
	String MWF4;
	String MWF5;
	
	String TTH0;
	String TTH1;
	String TTH2;
	String TTH3;
	String TTH4;
	
	ArrayList<Course> courses;
	ArrayList<User> users;
	ArrayList<Room> rooms;
	ArrayList<AbstractCourseConstraint> constraints;
	ArrayList<String> possibleClassTimes;
	ArrayList<String> departments;
	ArrayList<String> terms;
	ArrayList<User> faculty; // this is how permissions are basically done in this system
	
	DataStore data;
	//decide whether to make array list of departments department class or string
	
	
	@BeforeEach
	void setUp() throws Exception
	{
	//	ArrayList<String> CrossListedCodes = new ArrayList<String>();
	String D0 = "CSC";
	String D1 = "DSC";
	String D2 = "LIN";
	String D3 = "MAT";
	
	User U1 = new User("336751","James Dean","Student"); // For Sprint II I will hardcast the types to an enum, ie get rid of the the strings
	User U2 = new User("543210","Jose Rodriguez","Student");  //userId is a 6 character string
	User F1 = new User("123456","James Kelly","Chair");
	User F2 = new User("132456","Robert White", "Registrar");
	String MWF0 = ("MWF8:00");
	String MWF1 = ("MWF9:10");
	String MWF2 = ("MWF10:20");
	String MWF3 = ("MWF12:40");
	String MWF4 = ("MWF1:50");
	String MWF5 = ("MWF2:00");
	
	String TTH0 = ("TTH8:00");
	String TTH1 = ("TTH9:40");
	String TTH2 = ("TTH11:20");
	String TTH3 = ("TTH12:50");
	String TTH4 = ("TTH2:10");
	//Add labs in later, perhaps
	
	Room R1 = new Room("211", "Olin", 30);
	Course C1 = new Course("eng101", "English 101", "English", "Dr. E", MWF0, R1);
	Room R2 = new Room("207", "Olin", 28);
	Course C2 = new Course("csc170", "Computer Science 170", "CompSci", "Dr. B", MWF1, R2);
	ArrayList<Course> courses = new ArrayList<Course>();
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Room> rooms = new ArrayList<Room>();
	ArrayList<User> faculty = new ArrayList<User>();
	users.add(U1);
	users.add(U2);
	users.add(F1);
	users.add(F2);
	faculty.add(F1);
	faculty.add(F2);
	courses.add(C1);
	courses.add(C2);
	rooms.add(R1);
	rooms.add(R2);
	
	DataStore data = new DataStore(users, courses, rooms);
	
	
	}
	
	@Test
	void testSearch() 
	{
		
	}

}
