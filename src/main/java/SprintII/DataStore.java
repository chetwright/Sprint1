package SprintII;
import java.util.*;

public class DataStore 
{
	
		private ArrayList<User> allUsers;
		private ArrayList<Course> allCourses;
		private ArrayList<Room> allRooms;
		private Arraylist<Department> allDepartments;
		private ArrayList<AbstractCourseConstraint> globalConstraints;
		private ArrayList<String> possibleClassTimes;
		private ArrayList<String> terms;
		private ArrayList<User> faculty; //This may not be necessary but we will keep it
		private ArrayList<ProposedSchedule> allPropScheds;
		private ArrayList<>
		private 
		RestClient rest;  // figure out how to implement this and declare it here
		
		public DataStore(ArrayList<User> users, ArrayList<Course> courses, ArrayList<Room> rooms,
				ArrayList<AbstractCourseConstraint> constraints, ArrayList<String> possibleClassTimes,
				ArrayList<String> departments, ArrayList<String> terms, ArrayList<User> faculty) {
			
			this.users = users;
			this.courses = courses;
			this.rooms = rooms;
			this.constraints = constraints;
			this.possibleClassTimes = possibleClassTimes;
			this.departments = departments;
			this.terms = terms;
			this.faculty = faculty;
		}
		public ArrayList<User> getUsers() {
			return users;
		}
		public void setUsers(ArrayList<User> users) {
			this.users = users;
		}
		public ArrayList<Course> getCourses() {
			return courses;
		}
		public void setCourses(ArrayList<Course> courses) {
			this.courses = courses;
		}
		public ArrayList<Room> getRooms() {
			return rooms;
		}
		public void setRooms(ArrayList<Room> rooms) {
			this.rooms = rooms;
		}
		public ArrayList<AbstractCourseConstraint> getConstraints() {
			return constraints;
		}
		public void setConstraints(ArrayList<AbstractCourseConstraint> constraints) {
			this.constraints = constraints;
		}
		public ArrayList<String> getPossibleClassTimes() {
			return possibleClassTimes;
		}
		public void setPossibleClassTimes(ArrayList<String> possibleClassTimes) {
			this.possibleClassTimes = possibleClassTimes;
		}
		public ArrayList<String> getDepartments() {
			return departments;
		}
		public void setDepartments(ArrayList<String> departments) {
			this.departments = departments;
		}
		public ArrayList<String> getTerms() {
			return terms;
		}
		public void setTerms(ArrayList<String> terms) {
			this.terms = terms;
		}
		public ArrayList<User> getFaculty() {
			return faculty;
		}
		public void setFaculty(ArrayList<User> faculty) {
			this.faculty = faculty;
		}
		
	}

}
