package scheduling;

public class User
{
	String id;
	String name;
	String userType;
	public User(String id, String name, String userType)
	{
		this.id = id;
		this.name = name;
		this.userType = userType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	

}
