package beans;

public interface EmployeeRecordService {
	public void changeSalary(int employeeID, double salaryNew);
	public void editName(int employeeID, String nameNew);
	public Employee getEmployee(int employeeID);
}
