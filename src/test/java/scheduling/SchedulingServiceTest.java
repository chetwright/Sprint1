package scheduling;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchedulingServiceTest {
	Room R1;
	Course C1;
	ArrayList<Course> courses;
	DataStore data;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
	//	ArrayList<String> CrossListedCodes = new ArrayList<String>();
	User U1 = new User("336751","James Dean");
	User U2 = new User("543210","Jose Rodriguez");
	Room R1 = new Room("211", "Olin", 30);
	Course C1 = new Course("eng101", "English 101", "English", "Dr. E", "8:00", R1);
	Room R2 = new Room("207", "Olin", 28);
	Course C2 = new Course("csc170", "Computer Science 170", "CompSci", "Dr. B", "9:10", R2);
	ArrayList<Course> courses = new ArrayList<Course>();
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Room> rooms = new ArrayList<Room>();
	users.add(U1);
	users.add(U2);
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
