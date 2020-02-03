 
public class Employee implements Comparable{
	
	private String firstName, lastName; 
	private int employeeID; 
	
	public Employee(String firstName, String lastName, int employeeID) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.employeeID = employeeID; 
	}
	
	public String getFirstName() {
		return firstName; 
	}
	public String getLastName() {
		return lastName; 
	}
	public int getEmployeeID(){
		return employeeID; 
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName; 
	}
	public void setLastName(String lastName) {
		this.lastName = lastName; 
	}
	public void setEmployeeID(int employeeID) {
		if(employeeID >=0 && employeeID <= 9999) {
			this.employeeID = employeeID; 
		}
	}
	
	@Override
	public String toString() {
		return lastName + "," + firstName + "(" + employeeID + ")" ; 
	}
	
	@Override 
	public boolean equals(Object other) {
		if(other instanceof Employee) {
			Employee otherEmployee = (Employee) other; 
			
			return this.employeeID == otherEmployee.employeeID; 
		} else {
			return false; 
		}
	}

	@Override
	public int compareTo(Object other) {
		if(other instanceof Employee) {
			Employee otherEmployee = (Employee) other; 
			if(this.employeeID < otherEmployee.employeeID) {
				return -1; 
			} else if(this.employeeID == otherEmployee.employeeID) {
				return 0; 
			} else {
				assert this.employeeID > otherEmployee.employeeID; 
				return 1; 
			}
			
		} else {
			return -99; 
		}
	
	  }
	}


