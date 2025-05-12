package scheduling;

public class Room 
{
	String roomID;
	String building;
	int capacity;
	public Room(String roomID, String building, int capacity) {
		super();
		this.roomID = roomID;
		this.building = building;
		this.capacity = capacity;
	}
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	            
}

