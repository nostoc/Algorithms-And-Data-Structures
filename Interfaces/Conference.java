import java.util.ArrayList; 
import java.util.Collections; 
/** 
 * Represents a employees conference attendance with limited enrollment.
 * @since 10/25/2019
 * @author Perihan Hill 
 */
public class Conference {
	
	private String conferenceName; 
	private int maxEnrollment; 
	private ArrayList<Employee> employees; 
	
	/**
	 * Creates an object described by the conference name and the maximum enrollment. 
	 * 
	 * @param conferenceName the name of the conference
	 * @param maxEnrollment the maximum number of employees that can enroll in the conference
	 */
	public Conference(String conferenceName, int maxEnrollment) {
		this.conferenceName = conferenceName; 
		this.maxEnrollment = maxEnrollment; 
		employees = new ArrayList<Employee>(); 
	}
	
	/**
	 * Adds an employee to the conference (if there is room) and updates the number of employees enrolled. 
	 * 
	 * @param e the employees to be added to this conference 
	 * @return true if there is room for the employee and the employee is successfully added and false otherwise  
	 */
	public boolean enrollEmployee(Employee e) {
		if(employees.size() < maxEnrollment) {
			return employees.add(e); 
		} else {
			return false; 
		}
	}
	
	/**
	 * Determines whether an employee is enrolled in this conference. 
	 * 
	 * @param e the employee who might be enrolled 
	 * @return true if the employee is enrolled and false otherwise 
	 */
	public boolean isEmployeeEnrolled(Employee e) {
		return employees.contains(e); 
	}
	
	/**
	 * Removed an employee from this conference and updates the number enrolled. 
	 * 
	 * @param e the employee to be dropped 
	 * @return true if the employee was dropped and successfully dropped and false otherwise
	 */
	public boolean dropEmployee(Employee e) {
		if(enrollEmployee(e)) {
			return employees.remove(e); 
		} else {
			return false; 
		}
	}
	
	/**
	 * Sorts the employee roster and prints the employee information to the console.
	 */
	public void printRoster() {
		Collections.sort(employees);
		for(int i = 0; i < employees.size(); i++) {
			Employee e = employees.get(i); 
			System.out.println(e.toString()); 
		}
	}
	
	/**
	 * Retrieves the name of the conference.
	 * @return the conference name. 
	 */
	public String getConferenceName() {
		return conferenceName; 
	}
	
	/**
	 * Updates the name of the conference
	 * @param conferenceName the new name of the conference 
	 */
	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName; 
	}
	
	/**
	 * Retrieves the number of employees enrolled in the conference 
	 * @return the number enrolled 
	 */
	public int getNumberEnrolled() {
		return employees.size(); 
	}
	
	/**
	 * Retrieves the number of employees that the conference allows. 
	 * @return the maximum enrollment 
	 */
	public int getMaxEnrollment() {
		return maxEnrollment; 
	}
	
	/**
	 * Updates the number of employees allowed in the conference if that value is positive 
	 * @param maxEnrollment the new maximum number of employees allowed in the conference 
	 */
	public void setMaxEnrollment(int maxEnrollment) {
		if(maxEnrollment >= 1) {
		this.maxEnrollment = maxEnrollment; 
	}
	}
	
	/**
	 * Retrieve a list of employees enrolled in this conference. 
	 * @return an ArrayList of enrolled employees 
	 */
	public ArrayList<Employee> getEmployees() {
		return employees; 
	}
	
	/**
	 * Retrieves a text representation of this conference 
	 * @return the text representation, which includes the name, number of employees enrolled, 
	 * 		   and the maximum enrollment. 
	 */
	@Override 
	public String toString() {
		return conferenceName + " (" + employees.size() + " out of "
				+ maxEnrollment + " spots filled)"; 
	}
	
	
}




















