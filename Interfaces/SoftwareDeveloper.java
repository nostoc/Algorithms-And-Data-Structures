
public class SoftwareDeveloper extends Employee {
	
	private String projectName; 
	private final static String UNDEFINED_PROJECTNAME = "Project Name Undefined"; 

	public SoftwareDeveloper(String firstName, String lastName, int employeeID, String projectName) {
		super(firstName, lastName, employeeID);
		this.projectName = projectName; 
	}
	
	// overloaded constructor
	public SoftwareDeveloper(String firstName, String lastName, int employeeID) {
		this(firstName, lastName, employeeID, UNDEFINED_PROJECTNAME); 
	}
	
	public String getProjectName() {
		return projectName; 
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName; 
	}
	
	@Override 
	public String toString() {
		String s = super.toString(); 
		s += "\n\tProject Name: " + projectName; 
		return s; 
	}

}
