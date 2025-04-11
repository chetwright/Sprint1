package scheduling;

public abstract class AbstractCourseConstraint 
{
	String constraintID;
	String constraintName;
	public AbstractCourseConstraint(String constraintID, String constraintName) {
		
		this.constraintID = constraintID;
		this.constraintName = constraintName;
	}
	public checkConstraint(Constraint Constraint)
	{
		
	}
}
