 /** 
  * @since 10/25/2019
  * @author Perihan Hill 
  */
public class EmployeeTester {
	
	public static void main(String[] args) {
		
		Employee[] theEmployees = new Employee[5]; 
		
		theEmployees[0] = new Employee("Thomas", "White", 1234);
		theEmployees[1] = new Employee("Walter", "Brown", 5678); 
		theEmployees[2] = new Employee("Sandy", "Worker", 4697);
		
	    Employee sd1 = new SoftwareDeveloper("Ella", "Smith" , 3348, "JavaSE 8"); 
		SoftwareDeveloper sd2 = new SoftwareDeveloper("John", "Miller", 2156);
		
		theEmployees[3] = sd1; 
		theEmployees[4] = sd2; 
		
		System.out.println(sd2.getProjectName()); 
		
		Conference c = new Conference("JavaEE Conference", 5); 
		c.enrollEmployee(theEmployees[0]); 
		c.enrollEmployee(theEmployees[1]); 
		c.enrollEmployee(theEmployees[2]); 
		c.enrollEmployee(sd1); 
		c.enrollEmployee(sd2); 
		
		c.printRoster();
		
		System.out.println(c.toString());
		
		
	}

}
