package scheduling;
import java.util.*;
public class Department 
{
	String id;
	String name;
	String chair;
	ProposedSchedule PropSched;
	
	public Department(String id, String name, String chair)
	{
		this.id = id;
		this.name = name;
		this.chair = chair;
		this.PropSched = PropSched;
		
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", chair=" + chair + "]";
	}

	public String getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	
	public String getChair() {
		return chair;
	}

	public void setChair(String chair) {
		this.chair = chair;
	}
	
	public void setPropSched(ProposedSchedule PropSched)
	{
		this.PropSched = PropSched;
	}
	
	public ProposedSchedule getPropSched(ProposedSchedule PropSched)
	{
		return PropSched;
		
	}
	
}
