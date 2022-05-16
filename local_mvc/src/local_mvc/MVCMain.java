package local_mvc;

public class MVCMain {

	public static void main(String[] args) {
		  // fetching the employee record based on the employee_id from the database 
		
		Employee model = retriveEmployeeFromDB();
		
		// creating a view to write Employee details on console  
		EmployeeView view = new EmployeeView();
		
		EmployeeController controller = new EmployeeController(model, view);
		
		controller.updateView();
		
		 //updating the model data  
		
		controller.setEmployeeName("Shreshtha");
		System.out.println("\n Employee details after update");
		
		controller.updateView();

	}
	
	
	private static Employee retriveEmployeeFromDB() {
		Employee Employee = new Employee();
		Employee.setEmpID("391");
		Employee.setEmpName("Radhey");
		return Employee;
	}

}
