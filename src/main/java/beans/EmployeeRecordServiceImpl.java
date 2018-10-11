package beans;

public class EmployeeRecordServiceImpl implements EmployeeRecordService {

	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public EmployeeRecordServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao=employeeDao;
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void changeSalary(int employeeID, double salaryNew) {
		
	Employee employee = employeeDao.find(employeeID);
	employee.setSalary(salaryNew);
	employeeDao.update(employee);
	}

	
	public void editName(int employeeID, String nameNew) {
		Employee employee = employeeDao.find(employeeID);
		employee.setName(nameNew);
		employeeDao.update(employee);

	}

	
	public Employee getEmployee(int employeeID) {
		return employeeDao.find(employeeID);
	}

}
