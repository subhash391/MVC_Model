package local_mvc;

public class EmployeeController {
	
	private Employee model;
	private EmployeeView view;
	
	//constructor to initialize
	
	public EmployeeController(Employee model, EmployeeView view) {
		this.model = model;
		this.view = view;
	}

	//getter and setter method
	public void setEmployeeID(String ID) {
		model.setEmpID(ID);
	}
	public String getEmployeeID() {
		return model.getEmpID()
		
	}
	
	public void setEmployeeName(String name) {
		model.setEmpName(name);
	}
	public String getEmployeeName() {
		return model.getEmpName();
	}
	
	//method to update view
	public void updateView() {
		view.printEmployeeDetails(model.getEmpID(), model.getEmpName());
	}
	

}
